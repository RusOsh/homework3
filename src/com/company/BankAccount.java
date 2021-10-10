package com.company;

public class BankAccount {
    private int balance;

    public static void main(String[] args){
        double balance;
      new BankAccount();
            balance = 0.0;
        }
        public void deposit (double amount){
            balance += amount;
        }

        public void withdraw(double amount){
        if (amount<=balance){
            balance -= amount;
        }
        else {
            System.err.println("На счету недостаточно денежных средств");
        }


        }

        public double getBalance(){
            return (double) balance;
            }

    }

