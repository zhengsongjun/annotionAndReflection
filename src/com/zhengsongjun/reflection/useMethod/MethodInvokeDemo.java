package com.zhengsongjun.reflection.useMethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodInvokeDemo {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class clazz = Class.forName("com.zhengsongjun.reflection.useMethod.MyClass");

        Method doNothingMethod = clazz.getMethod("doNothing");
        Object doNothingResult = doNothingMethod.invoke(clazz.newInstance());
        System.out.println(doNothingResult);


        // 调用有参数，有返回值的方法
        Method sumMethod = clazz.getMethod("sum",int.class,int.class);
        Object doSumMethodResult = sumMethod.invoke(clazz.newInstance(),1,2);
        System.out.println(doSumMethodResult);


        // 调用私有方法
        Method doPrivateMethod = clazz.getDeclaredMethod("privateMethod", int.class, int.class);
        doPrivateMethod.setAccessible(true);
        Object doPrivateMethodResult = doPrivateMethod.invoke(clazz.newInstance(),10,9);
        System.out.println(doPrivateMethodResult);


        // 调用静态方法
        Method doStaticMethod = clazz.getDeclaredMethod("staticMethod",String.class);
        doStaticMethod.setAccessible(true);
        Object doStaticMethodResult = doStaticMethod.invoke(null,"test");
        System.out.println(doStaticMethodResult);
    }
}
