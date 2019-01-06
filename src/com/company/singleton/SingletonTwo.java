package com.company.singleton;

/**
 * @Author: estelle
 * @Description:
 * @Date: Created in 14:48 2019/1/6
 * @Modified By:懒汉模式
 */
public class SingletonTwo {
    //2.声明类的唯一实例，使用private static修饰
    private static SingletonTwo singletonTwo;

    //1.将构造方式私有化，不允许外边直接创建对象
    private SingletonTwo() {

    }

    //3.提供一个用于获取实例的方法，使用public static修饰
    public static SingletonTwo getSingletonTwo() {
        if (singletonTwo != null)
            singletonTwo = new SingletonTwo();
        return singletonTwo;
    }
}