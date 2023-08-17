package com.zhengsongjun.reflection.reflectionAction.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MethodAction {
    public static void main(String[] args) {
        Class<Bird> birdClass = Bird.class;
        Method[] methods =  birdClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("-----------method");
            //method message
            System.out.println("method's message " +method);
            //method  annotion

            Annotation[] annotation = method.getAnnotations();
            for (Annotation annotation1 : annotation) {
                System.out.println("annotation :" + annotation1);
                if(annotation1 instanceof Markabel){
                    Markabel markabel = (Markabel) annotation1;
                    System.out.println("this's markabel is Markabel ,it's value is " +  markabel.value());
                }
            }
            // get returnType
            Class<?> returnType = method.getReturnType();
            System.out.println(returnType);

            String name = method.getName();

            // get Parameter
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("name's parameterType is" + parameterType);
            }

            Integer modifiers = method.getModifiers();
            System.out.println("method's modifiers is " + Modifier.toString(modifiers));
            System.out.println("----------------------------");
        }
    }
}
