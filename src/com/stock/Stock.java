package com.stock;

public class Stock {
    String stockName;
    int stockNumber;
    double stockPrice;

    Stock(String stockName, int stockNumber, double stockPrice) {
        this.stockName = stockName;
        this.stockNumber = stockNumber;
        this.stockPrice = stockPrice;
    }

    double stockValue() {
        return stockNumber*stockPrice;
    }
}
