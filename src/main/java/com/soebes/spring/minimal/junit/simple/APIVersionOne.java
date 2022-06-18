package com.soebes.spring.minimal.junit.simple;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@RequestMapping("/api/v1")
@RestController
public @interface APIVersionOne {
  @AliasFor(annotation = Component.class)
  String value() default "";
}
