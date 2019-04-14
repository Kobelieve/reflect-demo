package com.kobe.reflect.demo;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName GenericIgnore
 * @Description TODO
 * @Author Tao
 * @Date 2019-04-13 22:47
 * @Version 1.0
 */
public class GenericIgnore {

    /**
     * 反射略过泛型检查
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(1);
//        list.add("hello"); //这个是会报编译错的

        // 但是下面可以让list添加String类型
        Class<?> listClass = list.getClass();

        Method method = listClass.getMethod("add", Object.class);
        method.invoke(list, "hello");

        System.out.println(list);
    }

}
