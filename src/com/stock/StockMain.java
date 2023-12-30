package com.stock;

import java.util.Scanner;

public class StockMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stocks: ");
        int stocknum = sc.nextInt();
        StockPortfolio sp = new StockPortfolio(stocknum);
        sp.readStocks();
        sp.printStockReport();
    }
}
