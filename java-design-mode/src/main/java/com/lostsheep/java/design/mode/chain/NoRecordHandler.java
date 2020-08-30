package com.lostsheep.java.design.mode.chain;

import org.springframework.stereotype.Component;

/**
 * <b><code>NoRecordHandler</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2020/4/14 16:18.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
@Component("noRecord")
public class NoRecordHandler extends AbstractHandler {

    @Override
    public String handlerRequest(String request) {
        if ("2005".equals(request)) {
            return "丰石库中没有广告情况请求处理";
        }
        
        return getNextHandler().handlerRequest(request);
    }
}
