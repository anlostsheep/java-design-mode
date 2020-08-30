package com.lostsheep.java.design.mode.chain;

import org.springframework.stereotype.Component;

/**
 * <b><code>SingleListHandler</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2020/4/14 16:27.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
@Component("single")
public class SingleListHandler extends AbstractHandler {

    @Override
    public String handlerRequest(String request) {
        if (!"2002".equals(request) && !"2005".equals(request)) {
            return "单个黑白名单或默认广告匹配处理";
        }
        
        return null;
    }
}
