package com.lostsheep.java.design.mode.web.config;

import com.lostsheep.java.design.mode.web.utils.CustomPasswordEncoder;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * <b><code>ApplicationSecurityConfig</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2020/8/30 6:35 下午.
 *
 * @author dengzhen
 * @since java-design-mode 1.0.0
 */
@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                // 内存中校验
                .inMemoryAuthentication()
                // 用户1
                .withUser("user1").password("user1").roles("normalUser")
                .and()
                // 用户2
                .withUser("user2").password("user2").roles("normalUser")
                .and()
                // 5.0 后必须指定密码加密
                .passwordEncoder(new CustomPasswordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                // 所有请求校验
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                // 表单提价认证
                .formLogin()
                .and()
                // 允许 http 请求
                .httpBasic();
    }
}
