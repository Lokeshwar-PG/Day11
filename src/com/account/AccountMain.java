package com.account;

public class AccountMain {
    public static void main(String[] args) {
        Account acc=new Account("Lokesh",500);

        System.out.println(acc.getBalance());
        acc.credit(0);
        System.out.println(acc.getBalance());
        acc.debit(500);
        System.out.println(acc.getBalance());
    }
}
