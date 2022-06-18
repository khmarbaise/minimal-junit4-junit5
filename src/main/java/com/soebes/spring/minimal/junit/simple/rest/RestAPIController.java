package com.soebes.spring.minimal.junit.simple.rest;

import com.soebes.spring.minimal.junit.simple.APIVersionOneAndTwo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicLong;

@APIVersionOneAndTwo
class RestAPIController {

  private static final Logger LOGGER = LoggerFactory.getLogger(RestAPIController.class);
  private final AtomicLong counter;

  RestAPIController() {
    this.counter = new AtomicLong();
    LOGGER.info("Started RestAPIController with {}", counter);
  }

  @RequestMapping(method = RequestMethod.GET, path = "get", produces = MediaType.APPLICATION_JSON_VALUE)
  ResponseEntity<String> greeting() throws SocketException, UnknownHostException {

    String hostAddress = InetAddress.getLocalHost().getHostAddress();

    NetworkInterface.networkInterfaces().forEach(networkInterface -> LOGGER.info("networkInterface = " + networkInterface));
    LOGGER.info("hostAddress = " + hostAddress);

    return ResponseEntity.ok("IP" + hostAddress);
  }


}