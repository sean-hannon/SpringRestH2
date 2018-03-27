package com.seanhannon.urlShort.service;

import com.google.common.hash.Hashing;
import com.seanhannon.urlShort.entity.URLEntity;
import com.seanhannon.urlShort.model.UnencodedURL;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.validator.routines.UrlValidator;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;


@Service
@Slf4j
public class EncodeService {


  final UrlValidator urlValidator = new UrlValidator(new String[] {"http", "https"});

  public URLEntity encodeUrl(UnencodedURL unencodedURL) {
    if (urlValidator.isValid(unencodedURL.getUrl())){
      String url = unencodedURL.getUrl();
      return hashUrl(url);
    }
    return null;
  }

  private URLEntity hashUrl(String url) {
    String id = Hashing.murmur3_32().hashString(url, StandardCharsets.UTF_8).toString();
    URLEntity urlEntity = new URLEntity(id, url, "http://mydomain.com/" + id);
    return urlEntity;
  }
}
