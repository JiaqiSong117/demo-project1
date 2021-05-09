package com.example.demo.service;

import com.example.demo.domain.Feedback;
import com.example.demo.domain.NewsMedia;

import java.io.IOException;
import java.util.List;

public interface FeedbackService {
    List<Feedback> selectAll() throws IOException;
    int addFeedback(String name, String email, String text) throws IOException;
}

//public interface NewsMediaService {
//
//    List<NewsMedia> selectAll() throws IOException;
//}

