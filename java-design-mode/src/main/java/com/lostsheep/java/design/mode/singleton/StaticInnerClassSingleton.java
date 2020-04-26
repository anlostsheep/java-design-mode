package com.lostsheep.java.design.mode.singleton;

/**
 * <b><code>StaticInnerClassSingleton</code></b>
 * <p/>
 * 静态内部类实现单例模式
 * <p/>
 * <b>Creation Time:</b> 2020/4/24 17:45.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
    }

    private static class SingletonInner {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return SingletonInner.INSTANCE;
    }

}
