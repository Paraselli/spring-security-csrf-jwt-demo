
package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

  @GetMapping("/hello")
  public String hello() {
    return "Hello Secure API";
  }
}
