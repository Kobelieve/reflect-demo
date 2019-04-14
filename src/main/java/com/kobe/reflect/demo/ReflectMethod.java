package com.kobe.reflect.demo;

import java.lang.reflect.Method;

/**
 * @ClassName ReflectMethod
 * @Description TODO
 * @Author Tao
 * @Date 2019-04-13 18:15
 * @Version 1.0
 */
public class ReflectMethod {

    /**
     * 用反射获取类的方法
     * getMethods()获取到这个类及它有关的类（父类和接口）的所有public方法
     * getDeclaredMethods()只会获取到当前类的所有方法（public、protected、default、private）
     *
     * @param args
     */
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> dogClass = Class.forName("com.kobe.reflect.Dog");

        Method[] methods = dogClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        System.out.println("------------------");

        Method[] declaredMethods = dogClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method.getName());
        }

    }

}
