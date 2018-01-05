package org.huey.desiginpattern.factorymethod;

 /**
   * @param
   * @return
   * @description 具体工厂
   * @author: xiaoying@hexindai.com V1.0 2018/1/5 15:56
  */
public class OrangeFactory implements FruitFactory{
     public Fruit getInstance() {
         return new Orange();
     }
 }
