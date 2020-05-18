package com.kbernetes.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HelloWorldController {
  @CrossOrigin
  @RequestMapping("/hello")
  @ResponseBody
  public String sayHello() {
    return "Hello there, lets play with kubernetes!!!";
  }

}
