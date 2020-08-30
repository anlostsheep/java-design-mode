package com.lostsheep.java.design.mode.web.controller;

import com.lostsheep.java.design.mode.web.vo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b><code>IndexController</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2020/8/30 6:11 下午.
 *
 * @author dengzhen
 * @since java-design-mode 1.0.0
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @GetMapping({"", "/"})
    public Result<String> indexPage() {
        return Result.reply(200, "success", "Index page is www.baidu.com!");
    }
}
