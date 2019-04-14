package com.kobe.reflect.demo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @ClassName ReflectField
 * @Description TODO
 * @Author Tao
 * @Date 2019-04-13 18:33
 * @Version 1.0
 */
public class ReflectField {

    /**
     * 用反射获取成员变量
     * getFields()
     * getDeclaredFields()
     *
     * @param args
     */
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> dogClass = Class.forName("com.kobe.reflect.Dog");

        Field[] fields = dogClass.getFields();
        for (Field field :fields) {
            System.out.println(field);
        }

        System.out.println("---------");
        Field[] declaredFields = dogClass.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
        }

    }

}
