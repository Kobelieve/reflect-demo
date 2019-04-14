package com.kobe.reflect.demo;

import com.kobe.reflect.Dog;

/**
 * @ClassName InstanceOperation
 * @Description TODO
 * @Author Tao
 * @Date 2019-04-13 22:14
 * @Version 1.0
 */
public class InstanceOperation {

    /**
     * 获取到对象的实例，并操作对象
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        Class<?> dogClass = Class.forName("com.kobe.reflect.Dog");

        Dog dog = (Dog) dogClass.newInstance();
        dog.setId(1);
        dog.setName("haha");

        System.out.println(dog.getName());
    }

}
