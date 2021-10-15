package edu.sharif.ce.kafka_producer.exchange.factory;

import edu.sharif.ce.kafka_producer.exchange.BinanceExchangeApi;
import edu.sharif.ce.kafka_producer.exchange.ExchangeApi;
import edu.sharif.ce.kafka_producer.model.Exchange;

public class ExchangeApiFactory {
    public ExchangeApi create(Exchange exchange) {
        if (exchange == Exchange.BINANCE) {
            return new BinanceExchangeApi();
        }

        throw new UnsupportedOperationException();
    }
}
