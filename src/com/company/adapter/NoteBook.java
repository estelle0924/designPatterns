package com.company.adapter;

/**
 * @Author: estelle
 * @Description:
 * @Date: Created in 15:21 2019/1/6
 * @Modified By:
 */
public class NoteBook {
    private ThreePlugIf  plug;

    public NoteBook(ThreePlugIf plug){
        this.plug = plug;
    }

    public void charge(){
        plug.powerWithThree();
    }

    /**
     * 打印结果:{}
     * 类型通过转换{}
     * 使用二相电流供电{}
     * 借助继承适配器{}使用二相电流供电{}
     * @param args
     */
    public static void main(String[] args) {
        GBTwoPlug two =  new GBTwoPlug();
        ThreePlugIf three = new TwoPlugAdapter(two);
        NoteBook nb = new NoteBook(three);
        nb.charge();
        three = new TwoPlugAdapterExtends();
        nb = new NoteBook(three);
        nb.charge();
    }
}