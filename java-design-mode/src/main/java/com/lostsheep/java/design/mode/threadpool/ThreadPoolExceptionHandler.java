package com.lostsheep.java.design.mode.threadpool;

import lombok.extern.slf4j.Slf4j;

/**
 * <b><code>ThreadPoolExceptionHandler</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2020/5/2 1:29.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
@Slf4j
public class ThreadPoolExceptionHandler implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        log.info("线程池内线程[{}]发生异常", t);
        t.interrupt();
        log.error("线程异常:", e);
    }
}
