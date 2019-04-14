package com.kobe.reflect.demo;

/**
 * @ClassName ReflectConstrutor
 * @Description TODO
 * @Author Tao
 * @Date 2019-04-13 22:05
 * @Version 1.0
 */
public class ReflectSupClass {

    /**
     * 通过反射获得父类
     *
     * @param args
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> dogClass = Class.forName("com.kobe.reflect.Dog");

        Class<?> superclass = dogClass.getSuperclass();
        System.out.println(superclass);

    }

}
