package com.example.secretmanager_local.controller;

import com.example.secretmanager_local.dto.TestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @PostMapping("/testing")
  public void testingPost(@RequestBody TestDto testDto) {
    System.out.println(testDto.getName());
    System.out.println(testDto.getTestDate());
    System.out.println(testDto.getSaveDate());
  }
}
