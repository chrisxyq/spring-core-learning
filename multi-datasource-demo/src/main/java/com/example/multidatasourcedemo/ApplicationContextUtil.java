package com.example.multidatasourcedemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author yuanqixu
 */
@Component
@Slf4j
public class ApplicationContextUtil {
    @Autowired
    private ApplicationContext applicationContext;

    public String[] showBeans() {
        return applicationContext.getBeanDefinitionNames();
    }

    public <T> T getBean(String beanName, Class<T> t) {
        return applicationContext.getBean(beanName, t);
    }
}
