package com.lostsheep.java.design.mode.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * <b><code>GdAppStrategy</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2020/4/10 15:42.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
@Slf4j
public class GdAppStrategy implements AbstractStrategy {

    public GdAppStrategy() {
    }

    @Override
    public void strategyMethod() {
        log.info("具体策略类:GdAppStrategy 的具体策略方法被执行");
    }
}
