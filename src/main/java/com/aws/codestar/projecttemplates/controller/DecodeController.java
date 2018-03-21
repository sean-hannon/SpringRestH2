package com.aws.codestar.projecttemplates.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/decode", method = RequestMethod.GET, produces = "application/json")
public class DecodeController {

  public ResponseEntity decode(){
    return new ResponseEntity(null, HttpStatus.NOT_IMPLEMENTED);
  }
}
