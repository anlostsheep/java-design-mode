package com.lostsheep.java.design.mode.proxy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * <b><code>CglibProxy</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2020/4/24 16:17.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
@Slf4j
public class CglibProxy implements MethodInterceptor {

    private CglibRealSubject cglibRealSubject;

    public CglibProxy(CglibRealSubject cglibRealSubject) {
        this.cglibRealSubject = cglibRealSubject;
    }

    CglibRealSubject proxy() {
        // 创建 Enhancer 对象
        Enhancer enhancer = new Enhancer();
        // 设置代理的目标类
        enhancer.setSuperclass(CglibRealSubject.class);
        // 设置回调方法, this 代表是当前类对象, 因为当前类实现了 CallBack
        enhancer.setCallback(this);

        return (CglibRealSubject) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        log.info("cglib 动态代理代理方法执行前织入");
        Object invoke = method.invoke(cglibRealSubject, objects);
        log.info("cglib 动态代理代理方法执行后织入");
        
        return invoke;
    }
}
