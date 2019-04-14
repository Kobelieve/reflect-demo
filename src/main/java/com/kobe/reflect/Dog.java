package com.kobe.reflect;

/**
 * @ClassName Dog
 * @Description TODO
 * @Author Tao
 * @Date 2019-04-13 18:01
 * @Version 1.0
 */
public class Dog implements Animal, Movable {

    private int id;
    private String name;
    private int age;

    // 公共属性
    public String desc;

    public Dog() {

    }

    // 私有方法
    private Dog(String name) {
        this.name = name;
    }

    // 三个参数的构造方法
    public Dog(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 两个私有方法
    private void privateMethod() {
        System.out.println(" private method...");
    }

    private void privateMethod2(String name) {
        System.out.println(" private method2..."+name);
    }

    // 一个静态方法
    public static void staticMethod() {
        System.out.println("static method ...");
    }

    public void eat() {
        System.out.println("dog eat...(interface override method)");
    }

    public void move() {
        System.out.println("dog move...(interface override method)");
    }
}
