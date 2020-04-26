package com.lostsheep.java.design.mode.factorymethod;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * <b><code>FactoryMethodTest</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2020/4/10 14:41.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        Map<String, AbstractFactory> factoryMap = Maps.newHashMap();
        factoryMap.put("food", new FoodFactory());
        factoryMap.put("clothes", new ClothesFactory());

        AbstractFactory foodFactory = factoryMap.get("food");
        AbstractProduct foodFactoryProduct = foodFactory.createProduct();

        foodFactoryProduct.use();

    }
}
