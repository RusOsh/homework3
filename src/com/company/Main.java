package com.company;


public class Main {

    public static void main(String[] args) throws LimitException {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        System.out.println("Вы пополнили баланс " + bankAccount.getAmount());

        while (true) {
            try {
                System.out.println("Ваш текущий баланс составляет: " + bankAccount.getAmount());
                bankAccount.withdraw(6000);
                System.out.println("Вы сняли: 6000");

            } catch (LimitException limitException) {
                System.out.println(limitException.getMessage());
                System.out.println("Вы сняли оставшуюся сумму: " + bankAccount.getAmount());
                bankAccount.withdraw((int) bankAccount.getAmount());
                System.out.println("Ваш текущий баланс составляет: " + bankAccount.getAmount());
                break;
            }
        }
    }
}