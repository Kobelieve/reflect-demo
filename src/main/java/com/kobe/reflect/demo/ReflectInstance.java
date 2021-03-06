package com.kobe.reflect.demo;

import com.kobe.reflect.Dog;

/**
 * @ClassName ReflectConstrutor
 * @Description TODO
 * @Author Tao
 * @Date 2019-04-13 22:05
 * @Version 1.0
 */
public class ReflectInstance {

    public static void main(String[] args) throws Exception {

        Class<?> dogClass = Class.forName("com.kobe.reflect.Dog");

        Dog dog = (Dog) dogClass.newInstance();

        System.out.println(dog);
        dog.eat();

    }

}
