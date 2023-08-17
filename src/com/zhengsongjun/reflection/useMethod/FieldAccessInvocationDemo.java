package com.zhengsongjun.reflection.useMethod;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class FieldAccessInvocationDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class clazz = Class.forName("com.zhengsongjun.reflection.useMethod.Person");
        Person person = (Person) clazz.newInstance();
        System.out.println(person.toString());
        Field ageField = clazz.getDeclaredField("age");
        Field nameField = clazz.getField("name");
        ageField.setAccessible(true);
        ageField.set(person,60);
        nameField.set(person,"woaini");
        System.out.println(person.toString());
    }
}
