package com.main.Chapter4.exceptionEx;

public class AutoCloseObj implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("AutoCloseObj.close: Close method is called");
    }
}
