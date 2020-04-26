package com.lostsheep.java.design.mode.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * <b><code>RealSubject</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2020/4/24 15:29.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
@Slf4j
public class RealSubject implements AbstractSubject {

    @Override
    public void call() {
        log.info("realSubject call method");
    }
}
