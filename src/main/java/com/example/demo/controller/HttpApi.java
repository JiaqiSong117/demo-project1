package com.example.demo.controller;

import com.example.demo.service.impl.HttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "getApi")
public class HttpApi {
    @Autowired
    private HttpClient httpClient;


    //outside URL method 
    @RequestMapping(value = "/TweetApi")
    public String testHttp(String id){
        String url = "https://publish.twitter.com/oembed?url=https://twitter.com/Interior/status/" + id + "&conversation=none&width=350&align=center&lang=en&hide_media=true&omit_script=true";
        HttpMethod method = HttpMethod.GET;
        MultiValueMap<String,String> params = new LinkedMultiValueMap<>();
        return httpClient.client(url,method,params);
    }

}
