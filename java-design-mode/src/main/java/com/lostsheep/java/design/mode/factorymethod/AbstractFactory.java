package com.lostsheep.java.design.mode.factorymethod;

/**
 * <b><code>AbstractFactory</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2020/4/10 14:26.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
public interface AbstractFactory {

    /**
     * 抽象工厂-抽象生产产品方法
     *
     * @return 抽象产品
     */
    AbstractProduct createProduct();
}
