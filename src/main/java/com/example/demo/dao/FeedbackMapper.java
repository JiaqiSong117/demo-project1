package com.example.demo.dao;


import com.example.demo.domain.Feedback;
import com.example.demo.service.FeedbackService;

import java.util.List;

public interface FeedbackMapper {
    List<Feedback> selectAll();
    int addFeedback(Feedback feedback);
}

//public interface NewsMediaMapper {
//
//    List<NewsMedia> selectAll();
//}
