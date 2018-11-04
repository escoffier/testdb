package com.example.dbtest;

import com.example.dbtest.mapper.UserMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;

//@Configuration
@SpringBootApplication
public class DbtestApplication {

    public static void main(String[] args) {

        SpringApplication.run(DbtestApplication.class, args);
    }

}
