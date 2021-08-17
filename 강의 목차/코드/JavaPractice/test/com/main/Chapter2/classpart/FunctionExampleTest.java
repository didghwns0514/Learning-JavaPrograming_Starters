package com.main.Chapter2.classpart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionExampleTest {

    FunctionExample testFunctionExample;

    @Test
    @DisplayName("Function method 수행 테스트 여부 int + int = int 1")
    void testAddIntToInt1(){
        testFunctionExample = new FunctionExample(125, 130);
        Assertions.assertEquals(testFunctionExample.addNum(), 255);

    }

    @Test
    @DisplayName("Function method 수행 테스트 여부 int + int = int 2")
    void testAddIntToInt2(){
        testFunctionExample = new FunctionExample(125, 131);
        Assertions.assertEquals(testFunctionExample.addNum(), 256);

    }


}