package edu.sharif.ce.kafka_producer.config;

import com.binance.api.client.domain.market.CandlestickInterval;
import edu.sharif.ce.kafka_producer.model.Exchange;

import java.util.List;

public class Config {
    public static final String BOOTSTRAP_SERVERS = "127.0.0.1:9092";
    public static final String TOPIC = "cryptocurrency";
    public static final List<String> SYMBOLS = List.of("ETHBTC", "LTCBTC", "BNBBTC", "NEOBTC", "QTUMETH");
    public static final String BINANCE_API_KEY = "";
    public static final String BINANCE_SECRET = "";
    public static final Exchange EXCHANGE = Exchange.BINANCE;
    public static final CandlestickInterval CANDLESTICK_INTERVAL = CandlestickInterval.ONE_MINUTE;
    public static final int PRODUCER_DELAY = 60_000;
}
