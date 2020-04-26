package com.lostsheep.java.design.mode.strategy;

/**
 * <b><code>Context</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2020/4/10 15:46.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
public class Context {

    private AbstractStrategy strategy;

    public Context(Class<?> strategyClass) throws IllegalAccessException, InstantiationException {
        this.strategy = (AbstractStrategy) strategyClass.newInstance();
    }

    public void executeStrategy() {
        strategy.strategyMethod();
    }
}
