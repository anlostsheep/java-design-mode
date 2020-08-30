package com.lostsheep.java.design.mode.chain;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * <b><code>ChainOfResponsibility</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2020/8/30 2:52 下午.
 *
 * @author dengzhen
 * @since java-design-mode 1.0.0
 */
@Service
public class ChainOfResponsibility {

    private final AbstractHandler globalHandler;
    private final AbstractHandler noRecordHandler;
    private final AbstractHandler singleHandler;

    public ChainOfResponsibility(@Qualifier("global") AbstractHandler globalHandler,
                                 @Qualifier("noRecord") AbstractHandler noRecordHandler,
                                 @Qualifier("single") AbstractHandler singleHandler) {
        this.globalHandler = globalHandler;
        this.noRecordHandler = noRecordHandler;
        this.singleHandler = singleHandler;
    }

    public String processRequest(String param) {
        globalHandler.setNextHandler(noRecordHandler);
        noRecordHandler.setNextHandler(singleHandler);

        return globalHandler.handlerRequest(param);
    }

}
