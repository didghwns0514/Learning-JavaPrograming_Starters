package com.main.Chapter2.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanySingletonTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("동일 인스턴스 비교")
    void compareSameInstance() {
        CompanySingleton companySingleton1 = CompanySingleton.getInstance();
        CompanySingleton companySingleton2 = CompanySingleton.getInstance();

        Assertions.assertEquals(companySingleton1, companySingleton2);
    }
}