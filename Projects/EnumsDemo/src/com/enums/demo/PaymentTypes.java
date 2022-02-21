package com.enums.demo;

public enum PaymentTypes {
    CASH(1), CARD(3), CHEQUE(2), GIFTCARD(4);

    int tenderValue;

    PaymentTypes(int tenderValue) {
        this.tenderValue = tenderValue;
    }

    public int getTenderValue() {
        return this.tenderValue;
    }
}
