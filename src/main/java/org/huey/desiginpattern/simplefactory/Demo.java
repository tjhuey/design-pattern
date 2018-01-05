package org.huey.desiginpattern.simplefactory;

 /**
   * @param
   * @return
   * @description 使用者
   * @author: xiaoying@hexindai.com V1.0 2018/1/5 15:16
  */
public class Demo {

     public static void main(String[] args) {

         Fruit appleInstance = FruitFactory.getInstance(FruitFactoryDefinition.APPLE_TYPE);
         appleInstance.getName();
         Fruit orangeInstance = FruitFactory.getInstance(FruitFactoryDefinition.ORANGE_TYPE);
         orangeInstance.getName();
     }
}
