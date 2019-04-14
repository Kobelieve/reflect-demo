package com.kobe.reflect.demo;

import java.lang.reflect.Constructor;

/**
 * @ClassName ReflectConstrutor
 * @Description TODO
 * @Author Tao
 * @Date 2019-04-13 22:05
 * @Version 1.0
 */
public class ReflectConstrutor {

    /**
     * 通过反射获取构造器
     *
     * @param args
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> dogClass = Class.forName("com.kobe.reflect.Dog");

        Constructor<?>[] constructors = dogClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println("--------------------");

        Constructor<?>[] declaredConstructors = dogClass.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            System.out.println(constructor);
        }

    }

}
