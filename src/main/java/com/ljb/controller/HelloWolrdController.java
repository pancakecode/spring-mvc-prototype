package com.ljb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/helloworld")
class HelloWolrdController {
    public String index() {
        return jsp();
    }

    @RequestMapping(value = "/jsp")
    public String jsp() {
        return "test/test";
    }

    @RequestMapping(value = "/ajax")
    @ResponseBody
    public String ajax() {
        return "hello world";
    }

}
