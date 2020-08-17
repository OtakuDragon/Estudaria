package com.kafka.course.twitter

import com.twitter.hbc.ClientBuilder
import com.twitter.hbc.core.Client
import com.twitter.hbc.core.Constants
import com.twitter.hbc.core.HttpHosts
import com.twitter.hbc.core.endpoint.StatusesFilterEndpoint
import com.twitter.hbc.core.processor.StringDelimitedProcessor
import com.twitter.hbc.httpclient.auth.Authentication
import com.twitter.hbc.httpclient.auth.OAuth1
import org.apache.kafka.clients.producer.*
import org.apache.kafka.common.serialization.StringSerializer
import java.lang.Exception
import java.util.*
import java.util.concurrent.LinkedBlockingQueue
import java.util.concurrent.TimeUnit


val msgQueue = LinkedBlockingQueue<String>(1000)

fun main() {
    val twitterClient = createTwitterClient()
    twitterClient.connect()

    val kafkaProducer = createKafkaProducer()
    (1..10).forEach{ _ ->
        val msg = msgQueue.poll(5, TimeUnit.SECONDS)
        if(msg != null){
            kafkaProducer.send(ProducerRecord("twitter_tweets", null, msg))
        }else{
            print("Nada")
        }
    }
    twitterClient.stop()
}

fun createKafkaProducer(): KafkaProducer<String, String>{
    val properties = Properties()
    properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092")
    properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer::class.java.name)
    properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer::class.java.name)

   return KafkaProducer(properties)
}

fun createTwitterClient(): Client{
    val hosebirdHosts =  HttpHosts(Constants.STREAM_HOST)
    val hosebirdEndpoint =  StatusesFilterEndpoint()
    val terms = listOf("coronavirus")
    hosebirdEndpoint.trackTerms(terms)
    val hosebirdAuth: Authentication = OAuth1("ZiVdxbvcVVeeYoOtjuOczdigZ",
        "A70XA6DvpWtyJW66hDzNdfJJAUnBrs1HJcnPEX2SDZZlC1xSYr",
        "2259488946-48qgTGeNvhGKHpcMCJNk26rIwnRyogtRG97P5KJ",
        "6ynaSNo9tDH5wUIfcyHwbbVzhGSb4CMhUD7MSyXsTPN7h")

    val builder = ClientBuilder()
        .name("Hosebird-Client-01") // optional: mainly for the logs
        .hosts(hosebirdHosts)
        .authentication(hosebirdAuth)
        .endpoint(hosebirdEndpoint)
        .processor(StringDelimitedProcessor(msgQueue))

    return builder.build()

}