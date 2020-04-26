package com.lostsheep.java.design.mode.chain;

/**
 * <b><code>NoRecordHandler</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2020/4/14 15:53.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
public class GlobalBlackListHandler extends AbstractHandler {

    @Override
    public String handlerRequest(String request) {
        if ("2002".equals(request)) {
            return "全局黑名单处理返回";
        }

        return getNextHandler().handlerRequest(request);
    }
}
