package edu.sharif.ce.kafka_producer;

import edu.sharif.ce.kafka_producer.producer.Producer;
import edu.sharif.ce.kafka_producer.config.Config;
import edu.sharif.ce.kafka_producer.exchange.factory.ExchangeApiFactory;

public class Main {
    public static void main(String[] args) {
        startProducer();
    }

    private static void startProducer() {
        var exchange = Config.EXCHANGE;

        var exchangeApi = new ExchangeApiFactory().create(exchange);
        var producer = new Producer(exchangeApi);

        producer.start();
    }
}
