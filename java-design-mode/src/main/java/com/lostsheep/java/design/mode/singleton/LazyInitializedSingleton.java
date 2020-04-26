package com.lostsheep.java.design.mode.singleton;

/**
 * <b><code>LazyInitializedSingleton</code></b>
 * <p/>
 * 懒汉式实现单例模式（存在多线程环境下的线程安全问题）
 * <p/>
 * <b>Creation Time:</b> 2020/4/24 17:31.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {
    }

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }

        return instance;
    }
}
