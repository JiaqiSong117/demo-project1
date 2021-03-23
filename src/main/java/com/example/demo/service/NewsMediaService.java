package com.example.demo.service;

import com.example.demo.domain.NewsMedia;

import java.io.IOException;
import java.util.List;

public interface NewsMediaService {

    List<NewsMedia> selectAll() throws IOException;
}
