package com.company.template;

/**
 * @Author: estelle
 * @Description:
 * @Date: Created in 17:16 2019/1/6
 * @Modified By:
 */
public class Coffee extends RefreshBeverage {

    @Override
    protected boolean isCustomerWantsCondiments() {
        return true;
    }

    @Override
    protected void brew() {
        System.out.println("用沸水冲泡咖啡");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加入糖和牛奶");
    }
}