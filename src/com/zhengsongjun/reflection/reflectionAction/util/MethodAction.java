package com.zhengsongjun.reflection.reflectionAction.util;

import java.lang.reflect.Method;

public class MethodAction {
    public static void main(String[] args) {
        Class<Bird> birdClass = Bird.class;
        Method[] methods =  birdClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
