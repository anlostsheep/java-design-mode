package com.lostsheep.java.design.mode.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * <b><code>DynamicRealSubject</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2020/4/24 16:01.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
@Slf4j
public class DynamicRealSubject implements BaseSubject {

    @Override
    public void call() {
        log.info("dynamicRealSubject call method");
    }
}
