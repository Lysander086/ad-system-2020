package com.imooc.ad.index;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* 用于保存所有index */
@Component
public class DataTable implements ApplicationContextAware, PriorityOrdered {

    public static final Map<Class /* 表示想保存的 索引类型 */, Object> dataTableMap = new ConcurrentHashMap<>();
    private static ApplicationContext applicationContext;

    private static <T> T bean(String beanName) {
        return (T) applicationContext.getBean(beanName);
    }

    private static <T> T bean(Class clazz) {
        return (T) applicationContext.getBean(clazz);
    }

    public static <T> T of(Class<T> clazz) {
        T instance = (T) dataTableMap.get(clazz);
        if (null != instance) {

        }

        dataTableMap.put(clazz, bean(clazz));
        return (T) dataTableMap.get(clazz);
    }

    @Override

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        DataTable.applicationContext = applicationContext;
    }

    @Override
    public int getOrder() {
        return PriorityOrdered.HIGHEST_PRECEDENCE;
    }
}
