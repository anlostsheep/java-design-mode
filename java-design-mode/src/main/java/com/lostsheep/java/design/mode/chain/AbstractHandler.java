package com.lostsheep.java.design.mode.chain;

import lombok.Data;

/**
 * <b><code>AbstractHandler</code></b>
 * <p/>
 * 责任链-抽象处理者
 * <p/>
 * <b>Creation Time:</b> 2020/4/14 15:43.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
@Data
public abstract class AbstractHandler {

    private AbstractHandler nextHandler;

    /**
     * 抽象处理者-抽象方法
     *
     * @param request 请求
     */
    public abstract String handlerRequest(String request);
}
