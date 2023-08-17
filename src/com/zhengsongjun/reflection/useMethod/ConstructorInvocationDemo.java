package com.zhengsongjun.reflection.useMethod;

import java.lang.annotation.ElementType;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorInvocationDemo {
    @SuppressWarnings("all")
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        // 动态调用构造器
        Class<?> personClass = Person.class;
        Constructor constructor = personClass.getDeclaredConstructor(String.class,int.class);
        constructor.setAccessible(true);
        Person person = (Person) constructor.newInstance("test",10);
        System.out.println(person);
    }
}
