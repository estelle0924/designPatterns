package com.company.adapter;

/**
 * @Author: estelle
 * @Description:
 * @Date: Created in 15:04 2019/1/6
 * @Modified By:
 */
public class TwoPlugAdapter implements ThreePlugIf{

    private GBTwoPlug gbTwoPlug;

    public TwoPlugAdapter(GBTwoPlug plug){
        this.gbTwoPlug = plug;
    }

    @Override
    public void powerWithThree() {
        System.out.println("类型通过转换{}");
        gbTwoPlug.powerWithTwo();
    }
}