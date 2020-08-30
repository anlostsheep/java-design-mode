package com.lostsheep.java.design.mode.web.controller;

import com.lostsheep.java.design.mode.web.vo.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b><code>LoginController</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2020/8/30 7:20 下午.
 *
 * @author dengzhen
 * @since java-design-mode 1.0.0
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    @PostMapping({"/", ""})
    public Result<String> login(String user) {
        return Result.reply(200, "登陆成功", user);
    }
}
