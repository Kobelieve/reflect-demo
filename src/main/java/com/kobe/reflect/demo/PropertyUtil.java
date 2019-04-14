package com.kobe.reflect.demo;

import com.kobe.reflect.Dog;

import java.lang.reflect.Field;

/**
 * @ClassName PropertyUtil
 * @Description TODO
 * @Author Tao
 * @Date 2019-04-13 22:51
 * @Version 1.0
 */
public class PropertyUtil {

    /**
     * 给任何对象，任何属性赋值
     */
    public static void setProperty(Object obj, String propertyName, Object value) {
        Class<?> clazz = obj.getClass();

        try {
            Field declaredField = clazz.getDeclaredField(propertyName);
            declaredField.setAccessible(true);
            declaredField.set(obj, value);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        PropertyUtil.setProperty(dog, "name", "okok");
        System.out.println(dog.getName());
    }

}
