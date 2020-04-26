package com.lostsheep.java.design.mode.strategy;

import java.util.Arrays;

/**
 * <b><code>StrategyTest</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2020/4/10 16:06.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
public class StrategyTest {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        StrategyEnum[] values = StrategyEnum.values();
        Class<?> strategyClass = Arrays.stream(values)
                .filter(v -> "gdapp".equals(v.getChannelName()))
                .map(StrategyEnum::getStrategyClass)
                .findAny()
                .orElseThrow(() -> new RuntimeException("渠道不存在"));
        Context context = new Context(strategyClass);
        context.executeStrategy();
    }
}
