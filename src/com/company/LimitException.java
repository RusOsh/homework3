package com.company;

public class LimitException extends Exception {
    public LimitException(String message, double remainingAmmount) {
        super(message);
        RemainingAmmount = remainingAmmount;
    }

    private double RemainingAmmount;

    public double getRemainingAmmount() {
        return RemainingAmmount;
    }
}
