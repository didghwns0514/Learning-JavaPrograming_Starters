package com.main.Chapter2.classcooperation;

public enum FeeTable {
    BUS_FEE(1200),
    SUBWAY_FEE(1400);

    public final int fee;

    FeeTable(int fee) {
        this.fee = fee;
    }

    public int getFee() {
        return this.fee;
    }
}
