package com.example.demo.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContoroller {

  @RequestMapping(value = "/", produces = {"*/*"}, method = RequestMethod.GET)
  public String hello() {
    return "hello";
  }

}
