package com.example.demo.service.impl;

import com.example.demo.dao.NewsMapper;
import com.example.demo.domain.News;
import com.example.demo.service.NewsService;
import com.example.demo.utils.JsonData;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class NewsImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public List<News> newsList() throws ExecutionException, InterruptedException {
        List<News> list = new ArrayList<>();
        List<QueryDocumentSnapshot> documents = newsMapper.getNews();
        for (QueryDocumentSnapshot document : documents) {
            System.out.println("id: " + document.getId());
            System.out.println("title: " + document.getString("title"));
            list.add(new News(Integer.parseInt(document.get("id").toString()),document.getString("title")));
        }
        return list;
    }

    @Override
    public void updateNews(News news) {
        newsMapper.addNewsDatabse(news);
    }


}
