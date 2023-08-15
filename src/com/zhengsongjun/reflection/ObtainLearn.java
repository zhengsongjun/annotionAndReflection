package com.zhengsongjun.reflection;

public class ObtainLearn {

    public static void main(String[] args) {
        Class stringClazz = String.class;
        Class animalClazz = Animal.class;

        System.out.println(stringClazz);
        System.out.println(animalClazz);

        System.out.println("-----------------");
        try {
            @SuppressWarnings({"unused"})
            Class stringClazz1 = Class.forName("java.lang.String");
            System.out.println(stringClazz1.getSimpleName());
            System.out.println(stringClazz1.getName());
            Class animalClazz1 = Class.forName("com.zhengsongjun.reflection.Animal");
            Class testOneDown1 = Class.forName("com.zhengsongjunCompany.reflectionLearn.TestOneDown");
            System.out.println(testOneDown1);
            System.out.println(animalClazz1);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("-----------------------------");

        ClassLoader ObtainLearnLoader = ObtainLearn.class.getClassLoader();
        try {
            @SuppressWarnings({"unused"})
            Class stringClazz3 = ObtainLearnLoader.loadClass("java.lang.String");
            Class animalClazz3 = ObtainLearnLoader.loadClass("com.zhengsongjun.reflection.Animal");
            System.out.println(animalClazz3);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
