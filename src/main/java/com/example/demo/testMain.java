package com.example.demo;

import com.example.demo.dao.NewsMediaMapper;
import com.example.demo.domain.NewsMedia;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.boot.SpringApplication;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class testMain {

    public static void main(String[] args) throws IOException {
        //test mybatis
        /*String resouce = "config/mybatis-config.xml";
        InputStream inputStream =  Resources.getResourceAsStream(resouce);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        try(SqlSession sqlSession = sqlSessionFactory.openSession()) {
            NewsMediaMapper newsMediaMapper = sqlSession.getMapper(NewsMediaMapper.class);
            List<NewsMedia> list = newsMediaMapper.selectAll();
            System.out.println(list.get(1).toString());
        }*/
    }


}

