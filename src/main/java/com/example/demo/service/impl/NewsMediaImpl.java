package com.example.demo.service.impl;

import com.example.demo.dao.NewsMediaMapper;
import com.example.demo.domain.NewsMedia;
import com.example.demo.service.NewsMediaService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class NewsMediaImpl implements NewsMediaService {
    @Override
    public List<NewsMedia> selectAll() throws IOException {
        String resouce = "config/mybatis-config.xml";
        InputStream inputStream =  Resources.getResourceAsStream(resouce);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        try(SqlSession sqlSession = sqlSessionFactory.openSession()){
            NewsMediaMapper newsMediaMapper = sqlSession.getMapper(NewsMediaMapper.class);
            List<NewsMedia> list = newsMediaMapper.selectAll();
            System.out.println(list);
            return list;
        }
    }
}
