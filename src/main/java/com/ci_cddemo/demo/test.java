package com.ci_cddemo.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther ChunKitAu
 * @create 2020-04-02 02
 */
@RestController
public class test {


    @GetMapping("/hello")
    public String hello(){

        return "hello";
    }
}
