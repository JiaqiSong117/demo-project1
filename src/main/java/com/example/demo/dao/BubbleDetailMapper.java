package com.example.demo.dao;

import com.example.demo.domain.BubbleDetail;
import com.example.demo.domain.News;
import com.example.demo.utils.JsonData;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BubbleDetailMapper {

    private static Map<Integer, BubbleDetail> detailMap = new HashMap<>();

    static {
        detailMap.put(1, new BubbleDetail(1,"Sport","Sport is Sport"));
        detailMap.put(2, new BubbleDetail(2,"Game","Game is Game"));
    }

    public List<BubbleDetail> getBubbleDetailList(){
        List<BubbleDetail> list = new ArrayList<>();
        list.addAll(detailMap.values());
        return list;
    }



}
