package com.onlyone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 测试Thymeleaf
 * Created by xmr on 2019/8/6.
 */
@Controller
public class ThymeleafController {
    // 正常和springmvc设置返回参数是意义的用法了
    @GetMapping("/map")
    public String index(String name, ModelMap map) {
        map.addAttribute("name", name);
        map.addAttribute("from", "lqdev.cn");
        // 模版名称，实际的目录为：src/main/resources/templates/thymeleaf.html
        return "thymeleaf";
    }

    @GetMapping("/mv")
    public ModelAndView index(String name) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", name);
        mv.addObject("from", "local.cn");
        // 模版名称，实际的目录为：src/main/resources/templates/thymeleaf.html
        mv.setViewName("thymeleaf");
        return mv;
    }

}
