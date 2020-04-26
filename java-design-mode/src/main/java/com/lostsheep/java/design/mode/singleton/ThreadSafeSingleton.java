package com.lostsheep.java.design.mode.singleton;

/**
 * <b><code>ThreadSafeSingleton</code></b>
 * <p/>
 * 线程安全的懒汉式加载单例模式
 * <p/>
 * <b>Creation Time:</b> 2020/4/24 17:34.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    /**
     * 使用同步锁锁住创建对象的方法（性能较低）
     *
     * @return instance
     */
    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }

        return instance;
    }

    /**
     * 使用双重检查锁判断，将同步块放在 if 条件中检查，以确保只有一个单例类的实例对象被创建
     *
     * @return instance
     */
    public static ThreadSafeSingleton getInstanceByDoubleLocking() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }

        return instance;
    }
}
