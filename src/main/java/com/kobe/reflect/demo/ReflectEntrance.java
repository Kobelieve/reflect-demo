package com.kobe.reflect.demo;

import com.kobe.reflect.Dog;

/**
 * @ClassName ReflectEntrance
 * @Description TODO
 * @Author Tao
 * @Date 2019-04-13 18:07
 * @Version 1.0
 */
public class ReflectEntrance {

    /**
     * 获取反射对象的三种方式（反射的入口）
     *  1.Class.forName(全类名)
     *  2.类名.class
     *  3.对象.getCLass()
     * @param args
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // 1.Class.forName()
        Class<?> dogClass1 = Class.forName("com.kobe.reflect.Dog");
        System.out.println(dogClass1);

        // 2.类名.class
        Class<?> dogClass2 = Dog.class;
        System.out.println(dogClass2);

        // 3.对象.getCLass()
        Dog dog = new Dog();
        Class<?> dogClass3 = dog.getClass();
        System.out.println(dogClass3);

    }

}
