package com.cy;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Create by 猪小帅
 * @date 2022/7/2 11:38
 * @mood happy
 */
@SpringBootTest
@Slf4j
public class LoggerTest {

//    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1() {
        String name = "nanjing";
        String password = "123";
        log.info("name: " + name + ", password: " + password);
        log.info("name: {}, password: {}", name, password);
        log.info("info...");
        log.debug("debug...");
        log.error("error...");
        log.warn("warn...");
    }
}
