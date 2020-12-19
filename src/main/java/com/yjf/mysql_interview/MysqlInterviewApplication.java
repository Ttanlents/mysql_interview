package com.yjf.mysql_interview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MysqlInterviewApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysqlInterviewApplication.class, args);
        List<Object> list = new ArrayList<>();
        list.add("");
    }

}
