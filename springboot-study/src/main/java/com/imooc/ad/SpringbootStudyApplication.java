package com.imooc.ad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/* 启用定时任务配置 */
@EnableScheduling
@SpringBootApplication
public class SpringbootStudyApplication {

    /**
     *  SpringBoot 应用入口类
     * */
	public static void main(String[] args) {

		SpringApplication.run(SpringbootStudyApplication.class, args);
	}
}

