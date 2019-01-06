package com.company.singleton;

/**
 * @Author: estelle
 * @Description:
 * @Date: Created in 14:47 2019/1/6
 * @Modified By:单例模式测试
 * 单例模式Singleton
 * 应用场合：有些对象只需要一个就足够了，如古代皇帝、老婆
 * 作用：保证整个应用程序中某个实例有且只有一个
 * 类型：饿汉模式、懒汉模式
 */
public class TestSingleton {

    /**
     * 打印结果:
     * singleton1和singleton2是同一个实例
     * =====================我是美丽的分界线!!!==========================
     * singletonTwo1和singletonTwo2是同一个实例
     *
     * @param args
     */
    public static void main(String[] args) {
        //饿汉模式
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        if (singleton1 == singleton2)
            System.out.println("singleton1和singleton2是同一个实例");
        else
            System.out.println("singleton1和singleton2不是同一个实例");

        System.out.println("=====================我是美丽的分界线!!!==========================");

        SingletonTwo singletonTwo1 = SingletonTwo.getSingletonTwo();
        SingletonTwo singletonTwo2 = SingletonTwo.getSingletonTwo();

        if (singletonTwo1 == singletonTwo2)
            System.out.println("singletonTwo1和singletonTwo2是同一个实例");
        else
            System.out.println("singletonTwo1和singletonTwo2不是同一个实例");

    }


}