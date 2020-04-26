package com.lostsheep.java.design.mode.strategy;

/**
 * <b><code>StrategyEnum</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2020/4/10 15:59.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
public enum StrategyEnum {

    /**
     * gdapp 渠道
     */
    GDAPP_STRATEGY("gdapp", GdAppStrategy.class),

    /**
     * 404 渠道
     */
    NOTFOUND_STRATEGY("navi", NotFoundStrategy.class),

    /**
     * toolbar 渠道
     */
    TOOLBAR_STRATEGY("toolbar", ToolbarStrategy.class);

    private String channelName;

    private Class<?> strategyClass;

    StrategyEnum(String channelName, Class<?> strategyClass) {
        this.channelName = channelName;
        this.strategyClass = strategyClass;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public Class<?> getStrategyClass() {
        return strategyClass;
    }

    public void setStrategyClass(Class<?> strategyClass) {
        this.strategyClass = strategyClass;
    }
}
