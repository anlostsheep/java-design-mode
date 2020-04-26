package com.lostsheep.java.design.mode.singleton;

/**
 * <b><code>EagerInitializedSingleton</code></b>
 * <p/>
 * 饿汉式加载单例模式
 * <p/>
 * <b>Creation Time:</b> 2020/4/24 17:03.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();

    private String name;
    private String others;

    private EagerInitializedSingleton() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public static EagerInitializedSingleton getInstance() {
        return INSTANCE;
    }
}
