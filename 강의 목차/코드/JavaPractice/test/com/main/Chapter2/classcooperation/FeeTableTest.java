package com.main.Chapter2.classcooperation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FeeTableTest {

    @Test
    @DisplayName("Fee enum 테스트")
    void checkEnumReturn () {
        Assertions.assertEquals(FeeTable.BUS_FEE.getFee(), 1200);
        Assertions.assertEquals(FeeTable.SUBWAY_FEE.getFee(), 1400);
    }

}