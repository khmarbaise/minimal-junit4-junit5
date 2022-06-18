package com.soebes.spring.minimal.junit.simple;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@RequestMapping(path = {"/api/v1", "/api/v2"})
@RestController
public @interface APIVersionOneAndTwo {
  @AliasFor(annotation = RestController.class)
  String value() default "";
}
