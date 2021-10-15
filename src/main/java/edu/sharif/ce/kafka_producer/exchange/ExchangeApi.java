package edu.sharif.ce.kafka_producer.exchange;

import com.binance.api.client.domain.market.CandlestickInterval;
import edu.sharif.ce.kafka_producer.model.Candlestick;

import java.util.List;

public interface ExchangeApi {
    List<Candlestick> getCandlestickBars(String symbol, CandlestickInterval interval);
}
