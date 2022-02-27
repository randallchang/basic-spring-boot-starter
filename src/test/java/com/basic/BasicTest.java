package com.basic;

import lombok.extern.slf4j.Slf4j;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Slf4j
public class BasicTest {

    @Test
    public void basicTest() {
        log.info("{}", 'a' - '1');
    }


}
