package com.commercialdataprocessing;

public class StockAccountMain {
    public static void main(String[] args) {
        StockAccount stockAccount = new StockAccount("Tata");
        stockAccount.buy(1000, "tata");
        stockAccount.buy(100, "tata");
        stockAccount.sell(5000, "tata");
        stockAccount.printReport();
    }
}
