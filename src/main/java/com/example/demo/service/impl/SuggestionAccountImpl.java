package com.example.demo.service.impl;

import com.example.demo.dao.NewsMediaMapper;
import com.example.demo.dao.SuggestionAccountMapper;
import com.example.demo.domain.NewsMedia;
import com.example.demo.domain.SuggestionsAccount;
import com.example.demo.service.SuggestionAccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class SuggestionAccountImpl implements SuggestionAccountService {
    @Override
    public List<SuggestionsAccount> selectAll() throws IOException {
        String resouce = "config/mybatis-config.xml";
        InputStream inputStream =  Resources.getResourceAsStream(resouce);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        try(SqlSession sqlSession = sqlSessionFactory.openSession()){
            SuggestionAccountMapper suggestionAccountMapper = sqlSession.getMapper(SuggestionAccountMapper.class);
            List<SuggestionsAccount> list = suggestionAccountMapper.selectAll();
            System.out.println(list);
            return list;
        }
    }
}
