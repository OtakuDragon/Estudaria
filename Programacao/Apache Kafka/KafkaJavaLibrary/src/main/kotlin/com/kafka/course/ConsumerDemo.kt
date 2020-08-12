package com.kafka.course

import org.apache.kafka.clients.consumer.ConsumerConfig
import org.apache.kafka.clients.consumer.KafkaConsumer
import org.apache.kafka.clients.producer.*
import org.apache.kafka.common.serialization.StringDeserializer
import org.apache.kafka.common.serialization.StringSerializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.lang.Exception
import java.time.Duration
import java.util.*
import java.util.function.Consumer

fun main() {
    val logger = LoggerFactory.getLogger("ConsumerLogger")
    val properties = Properties()
    properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092")
    properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer::class.java.name)
    properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer::class.java.name)
    properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, "group_1")
    //earliest = read from beginning, latest = read from next message
    properties.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest")

    val consumer = KafkaConsumer<String, String>(properties)

    consumer.subscribe(listOf("first_topic"))

    while (true){
        val consumerRecords = consumer.poll(Duration.ofMillis(100))
        consumerRecords.forEach { record -> run {
            logger.info("Key: ${record.key()} \n Value: ${record.value()} \n Partition ${record.partition()} \n Offset ${record.offset()}")
        } }
    }


}