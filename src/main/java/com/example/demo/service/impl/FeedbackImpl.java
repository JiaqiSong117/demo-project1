package com.example.demo.service.impl;

import com.example.demo.dao.FeedbackMapper;
import com.example.demo.dao.NewsMediaMapper;
import com.example.demo.domain.Feedback;
import com.example.demo.domain.NewsMedia;
import com.example.demo.service.FeedbackService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class FeedbackImpl implements FeedbackService {

    @Override
    public List<Feedback> selectAll() throws IOException {
        String resouce = "config/mybatis-config.xml";
        InputStream inputStream =  Resources.getResourceAsStream(resouce);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        try(SqlSession sqlSession = sqlSessionFactory.openSession()){
            FeedbackMapper feedbackMapper = sqlSession.getMapper(FeedbackMapper.class);
            List<Feedback> list = feedbackMapper.selectAll();
            System.out.println(list);
            return list;
        }

    }

    @Override
    public int addFeedback(String name, String email, String text) throws IOException {
        String resouce = "config/mybatis-config.xml";
        InputStream inputStream =  Resources.getResourceAsStream(resouce);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        try(SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
            FeedbackMapper feedbackMapper = sqlSession.getMapper(FeedbackMapper.class);
            Feedback feedback = new Feedback();
            feedback.setName(name);
            feedback.setEmail(email);
            feedback.setText(text);
            int row = feedbackMapper.addFeedback(feedback);
            return row;
        }
    }
}

//    @Override
//    public List<NewsMedia> selectAll() throws IOException {
//        String resouce = "config/mybatis-config.xml";
//        InputStream inputStream =  Resources.getResourceAsStream(resouce);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        try(SqlSession sqlSession = sqlSessionFactory.openSession()){
//            NewsMediaMapper newsMediaMapper = sqlSession.getMapper(NewsMediaMapper.class);
//            List<NewsMedia> list = newsMediaMapper.selectAll();
//            System.out.println(list);
//            return list;
//        }
//    }
