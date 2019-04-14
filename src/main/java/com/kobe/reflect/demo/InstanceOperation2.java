package com.kobe.reflect.demo;

import com.kobe.reflect.Dog;

import java.lang.reflect.Field;

/**
 * @ClassName InstanceOperation2
 * @Description TODO
 * @Author Tao
 * @Date 2019-04-13 22:18
 * @Version 1.0
 */
public class InstanceOperation2 {

    /**
     * setAccessible在属性上的使用
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        Class<?> dogClass = Class.forName("com.kobe.reflect.Dog");
        Dog dog = (Dog) dogClass.newInstance();

        Field nameField = dogClass.getDeclaredField("name");

        // 下面是很关键的一部，如果没有这一步，就会出错(访问权限不够)
        // 修改访问权限
        nameField.setAccessible(true);
        nameField.set(dog, "ooo");

        System.out.println(dog.getName());

    }

}
