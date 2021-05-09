package com.example.demo.controller;

import com.example.demo.domain.Feedback;
import com.example.demo.domain.NewsMedia;
import com.example.demo.service.FeedbackService;
import com.example.demo.service.NewsMediaService;
import com.example.demo.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(value = "/api/demo/feedback")

public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @GetMapping(value = "getAll")
    public Object getAll() throws IOException {
        List<Feedback> list = feedbackService.selectAll();
        return JsonData.buildSuccess(list);
    }

    @GetMapping(value = "add")
    public Object add(String name, String email, String text) throws IOException{
        int i = feedbackService.addFeedback(name,email,text);
        return i;
    }
}

//@RestController
//@RequestMapping("/api/demo/media")
//public class NewsMediaController {
//    @Autowired
//    private NewsMediaService newsMediaService;
//
//    @GetMapping(value = "getNewsMedia")
//    public Object getList() throws IOException {
//        List<NewsMedia> list = newsMediaService.selectAll();
//        return JsonData.buildSuccess(list);
//    }
//
//}

