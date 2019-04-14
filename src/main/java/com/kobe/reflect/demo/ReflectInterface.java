package com.kobe.reflect.demo;

/**
 * @ClassName ReflectInterface
 * @Description TODO
 * @Author Tao
 * @Date 2019-04-13 18:28
 * @Version 1.0
 */
public class ReflectInterface {

    /**
     * 用反射获取类的接口
     * getInterfaces()
     *
     * @param args
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> dogClass = Class.forName("com.kobe.reflect.Dog");

        Class<?>[] interfaces = dogClass.getInterfaces();
        for (Class<?> inter : interfaces) {
            System.out.println(inter);
        }
    }

}
