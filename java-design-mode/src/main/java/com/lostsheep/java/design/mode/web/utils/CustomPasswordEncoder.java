package com.lostsheep.java.design.mode.web.utils;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * <b><code>CustomPasswordEncorder</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2020/8/30 6:48 下午.
 *
 * @author dengzhen
 * @since java-design-mode 1.0.0
 */
public class CustomPasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence.toString());
    }
}
