package org.huey.desiginpattern.simplefactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @param
 * @return
 * @description 简单工厂
 * @author: xiaoying@hexindai.com V1.0 2018/1/5 13:29
 */
public class FruitFactory {

    private static Logger logger = LoggerFactory.getLogger(FruitFactory.class);
    /**
     * @param
     * @return
     * @description 根据规定标识返回需要的实例对象
     * @author: xiaoying@hexindai.com V1.0 2018/1/5 15:19
     */
    public static Fruit getInstance(String fruitType) {
        if (fruitType.equals(FruitFactoryDefinition.APPLE_TYPE)) {
            return new Apple();
        } else if (fruitType.equals(FruitFactoryDefinition.ORANGE_TYPE)) {
            return new Orange();
        }else {
            logger.info("没有该类型的对象");
            return null;
        }
    }
}
