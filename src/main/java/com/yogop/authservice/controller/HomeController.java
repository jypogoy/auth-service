package com.yogop.authservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jeffrey Y. Pogoy
 * @created 12 Sep 2017 5:19 PM
 */
@RestController
public class HomeController {

    @RequestMapping(value = "/")
    public String home() {
        return "Hello";
    }

    @RequestMapping(value = "/private")
    public String privateArea() {
        return "Private";
    }

}
