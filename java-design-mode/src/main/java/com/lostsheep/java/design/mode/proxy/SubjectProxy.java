package com.lostsheep.java.design.mode.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * <b><code>SubjectProxy</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2020/4/24 15:33.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
@Slf4j
public class SubjectProxy implements AbstractSubject {

    private AbstractSubject subject;

    public SubjectProxy(AbstractSubject subject) {
        this.subject = subject;
    }

    @Override
    public void call() {
        log.info("代理类代理方法执行前织入");
        subject.call();
        log.info("代理类代理方法执行后织入");
    }
}
