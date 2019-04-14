package com.kobe.reflect.demo;

import com.kobe.reflect.Dog;

import java.lang.reflect.Constructor;

/**
 * @ClassName Demo
 * @Description TODO
 * @Author Tao
 * @Date 2019-04-13 22:18
 * @Version 1.0
 */
public class InstanceOperation4 {

    /**
     * 反射操作构造方法
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        Class<?> dogClass = Class.forName("com.kobe.reflect.Dog");

        // 获取指定的构造方法, 那个三个参数的构造方法
        Constructor<?> constructor = dogClass.getConstructor(int.class, String.class, int.class);
        Dog dog = (Dog) constructor.newInstance(1, "ttt", 2);
        System.out.println("id : " + dog.getId() + ", name : " + dog.getName());

        //拿到私有的构造方法
        Constructor<?> oneCtr = dogClass.getDeclaredConstructor(String.class);
        oneCtr.setAccessible(true);
        Dog dog2 = (Dog) oneCtr.newInstance("大黄");
        System.out.println(dog2.getName());

    }

}
