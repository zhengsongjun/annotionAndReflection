package com.zhengsongjun.reflection.useMethod;

public class Person {
    public String name;
    private int age;

   public void Person(){

   }


    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

}
