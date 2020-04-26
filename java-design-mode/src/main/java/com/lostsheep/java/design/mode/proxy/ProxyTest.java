package com.lostsheep.java.design.mode.proxy;

/**
 * <b><code>ProxyTest</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2020/4/24 15:36.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
public class ProxyTest {
    public static void main(String[] args) {
        AbstractSubject subject = new RealSubject();
        SubjectProxy subjectProxy = new SubjectProxy(subject);
        subjectProxy.call();
    }
}
