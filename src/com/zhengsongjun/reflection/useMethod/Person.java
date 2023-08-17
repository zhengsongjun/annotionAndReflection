package com.zhengsongjun.reflection.useMethod;

public class Person {
    public String name;
    private int age;

   public void Person(){

   }

   private void Person(String name,int age){
      this.name = name;
      this.age = age;
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
