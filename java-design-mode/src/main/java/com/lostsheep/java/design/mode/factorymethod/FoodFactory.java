package com.lostsheep.java.design.mode.factorymethod;

import lombok.extern.slf4j.Slf4j;

/**
 * <b><code>FoodFactory</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2020/4/10 14:34.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
@Slf4j
public class FoodFactory implements AbstractFactory {

    @Override
    public AbstractProduct createProduct() {
        log.info("具体工厂:FoodFactory,生产具体产品:FoodProduct");
        return new FoodProduct();
    }
}
