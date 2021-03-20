package com.example.demo.controller;

import com.example.demo.domain.BubbleDetail;
import com.example.demo.domain.News;
import com.example.demo.service.BubbleDetailService;
import com.example.demo.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bubbleDetail")
public class BubbleDetailController {

    @Autowired
    private BubbleDetailService bubbleDetailService;

    @GetMapping(value = "detail")
    public Object detail() {

            return null;
    }


}
