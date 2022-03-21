package com.rdjtool.rdj.tool.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tool")
public class ToolController {

    @RequestMapping("/test")
    public String test(String ss){
        return ss;
    }

}
