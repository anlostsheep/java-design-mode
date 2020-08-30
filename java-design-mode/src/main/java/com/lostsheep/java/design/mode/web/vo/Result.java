package com.lostsheep.java.design.mode.web.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <b><code>Result</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2020/8/30 6:12 下午.
 *
 * @author dengzhen
 * @since java-design-mode 1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {

    private Integer code;
    private String message;
    private T data;

    public static <V> Result<V> reply(Integer code, String message, V v) {
        return new Result<>(code, message, v);
    }
}
