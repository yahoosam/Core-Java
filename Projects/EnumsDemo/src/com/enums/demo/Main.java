package com.enums.demo;

public class Main {

    public static void main(String[] args) {
        System.out.println(PaymentTypes.CARD);

        PaymentTypes[] values = PaymentTypes.values();
        for (PaymentTypes value : values) {
            System.out.println(value);
            System.out.println(value.ordinal());
            System.out.println(value.getTenderValue());
        }
    }
}
