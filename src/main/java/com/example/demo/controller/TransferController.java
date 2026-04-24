
package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TransferController {

  @PostMapping("/transfer")
  public String transfer(@RequestParam String amount) {
    return "Transferred: " + amount;
  }
}
