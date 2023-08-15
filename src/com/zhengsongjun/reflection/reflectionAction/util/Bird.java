package com.zhengsongjun.reflection.reflectionAction.util;
@Markabel(value = "mybird")
public class Bird extends Animal implements Flying , Comparable<Bird>{
    @Markabel(value = "类型")
    public String type;
    @Markabel(value = "年龄")
    public int age;

    @Markabel(value = "吃")
    private String eat;

    @Markabel(value = "构造方法")
    public Bird(String type) {
        this.type = type;
    }

    @Markabel(value = "构造方法")
    public Bird(String type,int age) {
        this.type = type;
        this.age = age;
    }

    private Bird(int age){
        this.age = age;
    }


    @Override
    public void fly() {
        System.out.println("我飞的很快");
    }

    @Override
    public int compareTo(Bird o) {
        return this.age - o.age ;
    }
}
