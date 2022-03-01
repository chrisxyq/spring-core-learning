package com.example.multidatasourcedemo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootTest
@Slf4j
class MultiDatasourceDemoApplicationTests {
    /**
     * springboot获取上下文
     */
    @Autowired
    private ApplicationContextUtil contextUtil;

    @Test
    public void showBeans() {
        log.info("contextUtil.showBeans():{}", Arrays.toString(contextUtil.showBeans()));
    }

    @Test
    public void getBean() {
        log.info("ApplicationContextUtil:{}",
                contextUtil.getBean("applicationContextUtil", ApplicationContextUtil.class).toString());
    }
}
