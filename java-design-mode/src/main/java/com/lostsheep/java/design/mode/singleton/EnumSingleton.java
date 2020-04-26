package com.lostsheep.java.design.mode.singleton;

/**
 * <b><code>EnumSingleton</code></b>
 * <p/>
 * 使用枚举实现单例模式
 * <p/>
 * <b>Creation Time:</b> 2020/4/24 17:56.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
public enum EnumSingleton {

    /**
     *
     */
    INSTANCE {
        @Override
        public EnumSingleton getInstance() {
            return INSTANCE;
        }
    };

    public abstract EnumSingleton getInstance();
}
