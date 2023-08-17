package com.zhengsongjun.reflection.useMethod;

public class MyClass {

    private  int count;

    public MyClass(){

    }

    public MyClass(int count) {
        this.count = count;
    }

    public void doNothing(){
        System.out.println("do nothine");
    }

    public int sum(int num1,int num2){
        return num1 + num2;
    }

    private int privateMethod(int num1,int num2) {
        return num1 - num2;
    }

    private static void staticMethod (String name) {
        System.out.println("do staticMethod " + name);
    }

}
