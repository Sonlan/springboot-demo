package com.song.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Song on 2017/2/15.
 * 项目启动入口，配置包根路径
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.song")
public class Entry {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Entry.class, args);
    }
}
