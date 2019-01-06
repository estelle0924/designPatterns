package com.company.template;

/**
 * @Author: estelle
 * @Description:
 * @Date: Created in 17:18 2019/1/6
 * @Modified By:
 */
public class Tea extends RefreshBeverage{

    @Override
    protected boolean isCustomerWantsCondiments() {
        return false;
    }

    @Override
    protected void brew() {
        System.out.println("用85度的热水浸泡茶叶5分钟");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加入柠檬");
    }
}