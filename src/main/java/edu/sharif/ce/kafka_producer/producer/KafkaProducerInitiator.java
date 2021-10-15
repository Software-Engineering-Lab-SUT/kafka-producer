package edu.sharif.ce.kafka_producer.producer;

import edu.sharif.ce.kafka_producer.model.Candlestick;
import edu.sharif.ce.kafka_producer.util.JsonSerializer;
import edu.sharif.ce.kafka_producer.config.Config;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class KafkaProducerInitiator {
    public KafkaProducer<String, Candlestick> create() {
        var bootstrapServers = Config.BOOTSTRAP_SERVERS;
        var keySerializerName = StringSerializer.class.getName();
        var valueSerializerName = JsonSerializer.class.getName();

        var properties = new Properties();
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, keySerializerName);
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, valueSerializerName);

        return new KafkaProducer<>(properties);
    }
}
