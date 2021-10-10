package com.company;

import java.util.InputMismatchException;

public  class Main {
    public static void main(String[] args) throws LimitException {
        while (true) {
            BankAccount bankAccount = new BankAccount();
            bankAccount.deposit(20000);
            bankAccount.withdraw(6000);
            bankAccount.withdraw(6000);
            bankAccount.withdraw(6000);
            bankAccount.withdraw(6000);


            System.out.println("BankAccount имеет баланс " + bankAccount);
            System.out.println(bankAccount.getBalance());
        }
    }
}



