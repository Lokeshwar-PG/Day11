package com.stock;

import java.util.Scanner;

public class StockPortfolio {
    Scanner sc = new Scanner(System.in);
    Stock[] stocks;
    public StockPortfolio(int stockNum) {
        stocks = new Stock[stockNum];
    }

    public void readStocks() {
        for(int i=0; i<stocks.length; i++) {
            System.out.println("Enter the details of Stock"+(i+1)+": ");
            System.out.println("Stock Name: ");
            String stockName = sc.next();
            System.out.println("Number of Stocks: ");
            int stockNumber = sc.nextInt();
            System.out.println("Stock Price: ");
            double stockPrice = sc.nextDouble();
            stocks[i] = new Stock(stockName,stockNumber,stockPrice);
        }
    }

    public void printStockReport() {
        System.out.println("Stock Name   Number of Stocks   Stock Price    Stock Value");
        System.out.println("__________________________________________________________");
        double totalValue = 0;
        for(Stock stock: stocks) {
            totalValue+=stock.stockValue();
            System.out.println(stock.stockName +"\t\t\t\t"+ stock.stockNumber +"\t\t\t\t"+ stock.stockPrice +"\t\t\t\t"+ stock.stockValue());
        }
        System.out.println("__________________________________________________________");
        System.out.println("Total value of stock: "+totalValue);
    }


}
