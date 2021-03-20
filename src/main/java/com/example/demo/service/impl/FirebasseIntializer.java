package com.example.demo.service.impl;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.FileInputStream;

@Service
public class FirebasseIntializer {

    @PostConstruct
    public void initializer(){
        try{
            FileInputStream serviceAccount =
                    new FileInputStream("C:\\mit\\FIT5120\\projectKey\\filter-bubble-firebase-adminsdk-52nub-63b28e9a47.json");

            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .build();

            FirebaseApp.initializeApp(options);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
