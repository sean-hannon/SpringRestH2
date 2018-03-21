package com.aws.codestar.projecttemplates.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/encode", method = RequestMethod.POST, produces = "application/json")
public class EncodeController {

  public ResponseEntity encode(){
    return new ResponseEntity(null, HttpStatus.NOT_IMPLEMENTED);
  }
}
