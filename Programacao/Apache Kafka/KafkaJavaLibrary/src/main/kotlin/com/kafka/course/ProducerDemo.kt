package com.kafka.course

import org.apache.kafka.clients.producer.*
import org.apache.kafka.common.serialization.StringSerializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.lang.Exception
import java.util.*
import java.util.function.Consumer

fun main() {
    val logger = LoggerFactory.getLogger("ProducerLogger")
    val properties = Properties()
    properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092")
    properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer::class.java.name)
    properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer::class.java.name)

    val producer = KafkaProducer<String, String>(properties)

    (1..10).forEach { index ->
        run {
            val record = ProducerRecord<String, String>("first_topic", "key_${index}", "Hello World $index")
            producer.send(record) { recordMetadata: RecordMetadata, exception: Exception? ->
                if (exception == null) {
                    logger.info("Received new metadata: \n topic ${recordMetadata.topic()} \n partition ${recordMetadata.partition()} \n offset ${recordMetadata.offset()} \n timestamp ${recordMetadata.timestamp()}")
                } else {
                    logger.error("error", exception)
                }
            }
        }
    }

    producer.flush()
    producer.close()
}