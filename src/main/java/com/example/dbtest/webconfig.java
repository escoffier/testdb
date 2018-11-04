package com.example.dbtest;

import com.example.dbtest.mapper.UserMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class webconfig {

    @Autowired
    SqlSessionFactory sqlSessionFactory = null;

    @Bean
    public MapperFactoryBean<UserMapper> initMyBatisUserMapper(){
        System.out.println("----------initMyBatisUserMapper");
        MapperFactoryBean<UserMapper> bean= new MapperFactoryBean<>();
        bean.setMapperInterface(UserMapper.class);
        bean.setSqlSessionFactory(sqlSessionFactory);
        return bean;

    }
}
