package com.lostsheep.java.design.mode.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * <b><code>BuilderTest</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2020/4/21 2:59.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
@Slf4j
public class BuilderTest {

    public static void main(String[] args) {
        User james = User.builder()
                .id(1)
                .age("18")
                .name("james")
                .build();
        log.info("james:{}", james);

        User kevin = User.builder()
                .name("kevin")
                .build();
        log.info("kevin:{}", kevin);

        User age = User.builder()
                .age("18")
                .build();
        log.info("age:{}", age);
    }
}
