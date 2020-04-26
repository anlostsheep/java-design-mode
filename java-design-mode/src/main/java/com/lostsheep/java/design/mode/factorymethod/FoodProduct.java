package com.lostsheep.java.design.mode.factorymethod;

import lombok.extern.slf4j.Slf4j;

/**
 * <b><code>FoodProduct</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2020/4/10 14:37.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
@Slf4j
public class FoodProduct implements AbstractProduct {

    @Override
    public void use() {
        log.info("使用食物产品");
    }
}
