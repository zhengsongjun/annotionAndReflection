package com.zhengsongjun.reflection.reflectionAction.util;

public class AnnotionInReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Class BirdClazz =  Class.forName("com.zhengsongjun.reflection.reflectionAction.util.Bird");
        System.out.println(BirdClazz.getAnnotation(Markabel.class));
    }
}
