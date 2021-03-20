package com.example.demo.service.impl;

import com.example.demo.dao.BubbleDetailMapper;
import com.example.demo.domain.BubbleDetail;
import com.example.demo.service.BubbleDetailService;
import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import jdk.nashorn.internal.runtime.regexp.joni.exception.InternalException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class BubbleDetailImpl implements BubbleDetailService {

    @Autowired
    private BubbleDetailMapper bubbleDetailMapper;


    @Override
    public String saveBubbleDetail(BubbleDetail bubbleDetail) throws InternalException, ExecutionException {
        Firestore firestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionApiFuture = null;
        return null;
    }

    @Override
    public List<BubbleDetail> getBubbleDetail() {
        return null;
    }
}
