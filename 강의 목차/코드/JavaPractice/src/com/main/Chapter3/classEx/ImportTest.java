package com.main.Chapter3.classEx;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ImportTest {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Class strClass = Class.forName("java.lang.String");

        Constructor[] constructors = strClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("constructor = " + constructor);
        }

        Field[] fields = strClass.getFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }

        Method[] methods = strClass.getMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        Class pReflectClass = Class.forName("com.main.Chapter3.classEx.Person");
        Person person = (Person) pReflectClass.newInstance(); // constructor가 불리는 메서드, depricated될 예정
        System.out.println("person = " + person);


    }
}
