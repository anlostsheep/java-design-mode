package com.lostsheep.java.design.mode.proxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Proxy;

/**
 * <b><code>DynamicProxyTest</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2020/4/24 16:03.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
@Slf4j
public class DynamicProxyTest {

    public static void main(String[] args) {
        BaseSubject subject = new DynamicRealSubject();

        BaseSubject proxyInstance = (BaseSubject) Proxy.newProxyInstance(
                subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(),
                (proxy, method, arg) -> {
                    log.info("jdk 动态代理代理方法执行前织入");
                    Object invoke = method.invoke(subject, arg);
                    log.info("jdk 动态代理代理方法执行后织入");
                    return invoke;
                });

        proxyInstance.call();
    }
}
