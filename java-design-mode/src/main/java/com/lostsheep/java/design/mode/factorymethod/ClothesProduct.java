package com.lostsheep.java.design.mode.factorymethod;

import lombok.extern.slf4j.Slf4j;

/**
 * <b><code>ClothesProduct</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2020/4/10 14:39.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
@Slf4j
public class ClothesProduct implements AbstractProduct {

    @Override
    public void use() {
        log.info("使用衣服产品");
    }
}
