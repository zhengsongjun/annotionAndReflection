package com.zhengsongjun.reflection.objectCreation;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String name = "com.zhengsongjun.reflection.objectCreation."+"Animal";
        Class clazz = Class.forName(name);
        Object clazz1 = clazz.newInstance();
        System.out.println(clazz1.toString());
    }
}
