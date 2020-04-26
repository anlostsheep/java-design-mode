package com.lostsheep.java.design.mode.proxy;

/**
 * <b><code>CglibProxtTest</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2020/4/24 16:25.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
public class CglibProxyTest {

    public static void main(String[] args) {
        CglibRealSubject cglibRealSubject = new CglibRealSubject();
        CglibRealSubject proxy = new CglibProxy(cglibRealSubject).proxy();

        proxy.call();
    }
}
