package com.xyf;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description
 * @Author
 * @Date
 **/
@SpringBootApplication
@Slf4j
public class XyfApplication {
    public static void main(String[] args) {
        SpringApplication.run(XyfApplication.class, args);
        log.info("启动成功" + "Hello World!");
    }
}
