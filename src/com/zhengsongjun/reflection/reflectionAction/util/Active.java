package com.zhengsongjun.reflection.reflectionAction.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Active {
    public static void main(String[] args) throws NoSuchMethodException {
        // 通过反射获取类名
        Class<Bird> birdClass = Bird.class;
        System.out.println(birdClass.getName());
        System.out.println(birdClass.getSimpleName());


        // 获取包名
        System.out.println("getPackageName" + birdClass.getPackage());
        // 获取公共构造器
        Constructor<?>[] constructors = birdClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }


        Constructor<?>[] declaredConstructors = birdClass.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            System.out.println("---------------");
            System.out.println(constructor);
            System.out.println(constructor.getModifiers());
            System.out.println("---------------");
        }

        // 获取参数
        System.out.println("------------获取参数--------------");
        Field[] fields = birdClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        // 获取全部参数
        System.out.println("---------------获取全部参数-----------------");
        Field[] fieldList = birdClass.getDeclaredFields();
        for (Field field : fieldList) {
            System.out.println(field);
        }
    }
}
