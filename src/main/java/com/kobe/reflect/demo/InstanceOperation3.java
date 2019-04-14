package com.kobe.reflect.demo;

import com.kobe.reflect.Dog;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @ClassName InstanceOperation3
 * @Description TODO
 * @Author Tao
 * @Date 2019-04-13 22:18
 * @Version 1.0
 */
public class InstanceOperation3 {

    /**
     * setAccessible在方法上的使用
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        Class<?> dogClass = Class.forName("com.kobe.reflect.Dog");
        Dog dog = (Dog) dogClass.newInstance();

        // 获取私有方法
        Method privateMethod = dogClass.getDeclaredMethod("privateMethod");

        privateMethod.setAccessible(true);
        privateMethod.invoke(dog, null);

        Method privateMethod2 = dogClass.getDeclaredMethod("privateMethod2", String.class);
        privateMethod2.setAccessible(true);
        privateMethod2.invoke(dog, "kkk");
    }

}
