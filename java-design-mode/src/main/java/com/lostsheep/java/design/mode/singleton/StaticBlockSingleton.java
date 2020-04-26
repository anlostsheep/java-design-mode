package com.lostsheep.java.design.mode.singleton;

/**
 * <b><code>StaticBlockSingleton</code></b>
 * <p/>
 * 使用静态代码块初始化单例对象
 * <p/>
 * <b>Creation Time:</b> 2020/4/24 17:24.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {
    }

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("创建单例对象失败!");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

}
