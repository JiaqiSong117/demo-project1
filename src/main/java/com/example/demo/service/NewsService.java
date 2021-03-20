package com.example.demo.service;

import com.example.demo.domain.News;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface NewsService {

    List<News> newsList() throws ExecutionException, InterruptedException;

    void updateNews(News news);
}
