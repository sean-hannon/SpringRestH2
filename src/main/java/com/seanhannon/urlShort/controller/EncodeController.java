package com.seanhannon.urlShort.controller;

import com.seanhannon.urlShort.entity.URLEntity;
import com.seanhannon.urlShort.model.UnencodedURL;
import com.seanhannon.urlShort.service.EncodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/encode")
public class EncodeController {

  @Autowired
  EncodeService encodeService;

  @RequestMapping(method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
  public ResponseEntity<URLEntity> encode(@RequestBody UnencodedURL unencodedURL){
    URLEntity encodedUrl = encodeService.encodeUrl(unencodedURL);
    if (encodedUrl != null) {
      return new ResponseEntity<URLEntity>(encodedUrl, HttpStatus.CREATED);
    } else {
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
  }
}
