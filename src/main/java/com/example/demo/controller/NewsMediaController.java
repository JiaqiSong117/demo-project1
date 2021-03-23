package com.example.demo.controller;

import com.example.demo.domain.NewsMedia;
import com.example.demo.service.NewsMediaService;
import com.example.demo.utils.JsonData;
import com.google.api.client.json.Json;
import com.google.auto.value.AutoAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/demo/media")
public class NewsMediaController {
    @Autowired
    private NewsMediaService newsMediaService;

    @GetMapping(value = "getNewsMedia")
    public Object getList() throws IOException {
        List<NewsMedia> list = newsMediaService.selectAll();
        return JsonData.buildSuccess(list);
    }

}
