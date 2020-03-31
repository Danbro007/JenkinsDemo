package com.danbro.jenkinsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname Controller
 * @Description TODO
 * @Date 2020/3/31 13:36
 * @Author Danrbo
 */
@RestController
public class Controller {
    @GetMapping("")
    public String hello(){
        return "hello test2";
    }

}
