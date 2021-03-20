package com.example.demo.service;


import com.example.demo.domain.BubbleDetail;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface BubbleDetailService {

    String saveBubbleDetail(BubbleDetail bubbleDetail) throws ExecutionException;

    List<BubbleDetail> getBubbleDetail();

}
