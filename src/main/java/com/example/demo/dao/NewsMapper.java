package com.example.demo.dao;

import com.example.demo.domain.News;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

@Repository
public class NewsMapper {

    private static Map<Integer, News> newsMap = new HashMap<>();


    static {
        //test data
        newsMap.put(1,new News(1,"news1"));
        newsMap.put(2,new News(2,"news2"));
        newsMap.put(3,new News(3,"news3"));

    }

    public List<QueryDocumentSnapshot> getNews() throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        // asynchronously retrieve all users
        ApiFuture<QuerySnapshot> query = db.collection("News").get();
        // query.get() blocks on response
        QuerySnapshot querySnapshot = query.get();
        List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
        return documents;
    }

    public void addNewsDatabse(News news){
        Firestore db = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> future = db.collection("News").document("RahGOFOpuEa4OybVm9Vx").set(news, SetOptions.merge());
    }

}
