package com.lostsheep.java.design.mode.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * <b><code>ToolbarStrategy</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2020/4/10 15:43.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
@Slf4j
public class ToolbarStrategy implements AbstractStrategy {

    @Override
    public void strategyMethod() {
        log.info("具体策略类:ToolbarStrategy 的具体策略方法被执行");
    }
}
