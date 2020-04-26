package com.lostsheep.java.design.mode.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * <b><code>CglibRealSubject</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2020/4/24 16:16.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
@Slf4j
public class CglibRealSubject {

    public void call() {
        log.info("cglibRealSubject call method");
    }
}
