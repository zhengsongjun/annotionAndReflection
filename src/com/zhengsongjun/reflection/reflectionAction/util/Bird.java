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

    @Markabel(value="walk method")
    private void walk(String name,Integer speed){
        System.out.println("name: " + name + "speed :"+ speed);
    }


    @Markabel(value="talk method")
    public void talk(String name,String message){
        System.out.println("name: " + name + "talk :"+ message);
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
