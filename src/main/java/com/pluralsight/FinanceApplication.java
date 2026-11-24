package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.Valuable;

public class FinanceApplication {
    public static void main(String[] args) {

        //?Creating the bank account
        BankAccount account1 = new BankAccount("123", "Pam", 12500);
        Valuable account2 = new BankAccount("456", "Gary", 1500);

        System.out.println(account1.getBalance());
        // try to deposit money into both accounts
         account1.deposit(500);
        System.out.println(account1.getBalance());

    }

// try to deposit money into both accounts



}
