package edu.sharif.ce.kafka_producer.model;

import java.util.Objects;

public class Candlestick {
    private final String symbol;
    private final Long openTime;
    private final String open;
    private final String high;
    private final String low;
    private final String close;
    private final Long closeTime;

    public Candlestick(String symbol, Long openTime, String open, String high, String low, String close, Long closeTime) {
        this.symbol = symbol;
        this.openTime = openTime;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.closeTime = closeTime;
    }

    public String getSymbol() {
        return symbol;
    }

    public Long getOpenTime() {
        return openTime;
    }

    public String getOpen() {
        return open;
    }

    public String getHigh() {
        return high;
    }

    public String getLow() {
        return low;
    }

    public String getClose() {
        return close;
    }

    public Long getCloseTime() {
        return closeTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candlestick that = (Candlestick) o;
        return Objects.equals(symbol, that.symbol) && Objects.equals(openTime, that.openTime) && Objects.equals(open, that.open) && Objects.equals(high, that.high) && Objects.equals(low, that.low) && Objects.equals(close, that.close) && Objects.equals(closeTime, that.closeTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, openTime, open, high, low, close, closeTime);
    }

    @Override
    public String toString() {
        return "Candlestick{" +
                "symbol='" + symbol + '\'' +
                ", openTime=" + openTime +
                ", open='" + open + '\'' +
                ", high='" + high + '\'' +
                ", low='" + low + '\'' +
                ", close='" + close + '\'' +
                ", closeTime=" + closeTime +
                '}';
    }
}
