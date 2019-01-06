package com.company.template;

/**
 * @Author: estelle
 * @Description:
 * @Date: Created in 17:05 2019/1/6
 * @Modified By:算法执行的统一骨架
 * 定义一个操作模式的算法骨架,子类在不改变骨架的基础上,实现具体的操作步骤
 */
public class TestTemplate {
    /**
     * 打印结果:{}
     * 制备咖啡...
     将水煮沸
     用沸水冲泡咖啡
     将饮料倒入杯中
     加入糖和牛奶
     咖啡好了！

     =====================我是分界线=====================
     制备茶...
     将水煮沸
     用85度的热水浸泡茶叶5分钟
     将饮料倒入杯中
     茶好了！
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("制备咖啡...");
        RefreshBeverage b1 = new Coffee();
        b1.prepareBeverageTemplate();
        System.out.println("咖啡好了！");

        System.out.println("\n=====================我是分界线=====================");

        System.out.println("制备茶...");
        RefreshBeverage b2 = new Tea();
        b2.prepareBeverageTemplate();
        System.out.println("茶好了！");
    }
}