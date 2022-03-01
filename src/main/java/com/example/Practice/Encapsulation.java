package com.example.Practice;

/**
 * HERE, we have a Banking System.
 *
 */
class Encapsulation_Bank {
    int accountNumber = 100;
    String name = "Ashish";
    int balance = 20000;
    String address = "India";

    /*
    Now, suppose for a customer, following data is inserted.

    accountNumber = 100
    name = "Ashish"
    balance = 20,000
    address = "India"

     */
}

/**
 * Now Ashsish went home, and via net Banking wants to check his Account Balance.
 */
class Encapsulation_NetBanking {
    public static void main(String a[]) {
        Encapsulation_Bank user = new Encapsulation_Bank();
        System.out.printf(String.valueOf(user.balance));
    }
}
