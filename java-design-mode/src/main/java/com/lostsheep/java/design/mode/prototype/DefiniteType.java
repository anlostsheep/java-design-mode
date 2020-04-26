package com.lostsheep.java.design.mode.prototype;

import lombok.extern.slf4j.Slf4j;

/**
 * <b><code>DefiniteType</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2020/4/10 11:09.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
@Slf4j
public class DefiniteType implements Cloneable {

    public DefiniteType() {
        log.info("具体原型类实例创建成功");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        log.info("调用具体原型类的 clone() 方法复制对象");
        return (DefiniteType) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        DefiniteType definiteTypeObj1 = new DefiniteType();
        DefiniteType definiteTypeObj2 = (DefiniteType) definiteTypeObj1.clone();
        log.info("原型对象{}原型复制对象", definiteTypeObj1 == definiteTypeObj2);
    }
}
