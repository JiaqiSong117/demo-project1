package com.example.demo.controller;
import com.example.demo.domain.News;
import com.example.demo.service.NewsService;
import com.example.demo.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/demo")
public class NewsController {

    @Autowired
    private NewsService newsService;


    //@RequestMapping(value = "list",method = RequestMethod.GET)
    @GetMapping(value = "list")
    public Object list() {
        try {
            List<News> list = newsService.newsList();
            return JsonData.buildSuccess(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JsonData.buildError("Error");
    }

    @PostMapping(value = "updateJson")
    public JsonData updataNewsJson(@RequestBody News news){
        //test
        System.out.println("News = " + news);
        //update
        newsService.updateNews(news);
        return JsonData.postSuccess("Already update to database");
    }

    @PostMapping(value = "updateUrl")
    public JsonData updataNewsUrl(int id, String title){
        //News news
        System.out.println("id = " + id + " Title = " + title);
        //update:
        News news = new News(id,title);
        newsService.updateNews(news);
        return JsonData.postSuccess("Already update to database");
    }



}
