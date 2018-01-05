package org.huey.desiginpattern.factorymethod;

/**
 * @param
 * @return
 * @description 使用者
 * @author: xiaoying@hexindai.com V1.0 2018/1/5 15:16
 */
public class Demo {

    public static void main(String[] args) {

        Fruit appleInstance = new AppleFactory().getInstance();
        Fruit orangeInstance = new OrangeFactory().getInstance();
        appleInstance.getName();
        orangeInstance.getName();
    }
}
