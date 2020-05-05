package com.lostsheep.java.design.mode.threadpool;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * <b><code>DefaultThreadPool</code></b>
 * <p/>
 * spring-ThreadPoolTaskExecutor 配置类
 * <p/>
 * <b>Creation Time:</b> 2020/5/2 0:45.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
@Configuration
@Slf4j
public class DefaultThreadPoolConfig {

    @Bean
    public ThreadPoolTaskExecutor executorBuilder() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();

        ThreadFactory threadFactory = new ThreadFactoryBuilder()
                .setDaemon(true)
                .setNameFormat("dsp-thread-pool-%d")
                .setUncaughtExceptionHandler(new ThreadPoolExceptionHandler())
                .build();

        // 设置线程工厂
        executor.setThreadFactory(threadFactory);
        // 核心线程数大小（CPU 个数乘以 2）
        executor.setCorePoolSize(2 * Runtime.getRuntime().availableProcessors());
        // 最大线程数大小（CPU 个数乘以 4）
        executor.setMaxPoolSize(4 * Runtime.getRuntime().availableProcessors());
        // 设置线程池中的队列大小
        executor.setQueueCapacity(2000);
        // 设置线程池中线程存活时间/s
        executor.setKeepAliveSeconds(6);
        // 设置线程池队列满时的拒绝策略: CallerRunsPolicy() 不进入线程池中的线程处理,由调用此方法的线程处理
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        // 初始化线程池
        executor.initialize();

        return executor;
    }
}
