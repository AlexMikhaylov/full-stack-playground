package com.example.backend.designpatterns.singleton.connectors;

import com.example.backend.designpatterns.interfaces.APIConnector;

public class GoogleAudienceAPIConnector implements APIConnector {

    // Thread Safe Singleton Implementation
    private static volatile GoogleAudienceAPIConnector instance;

    private GoogleAudienceAPIConnector() {}

    public static GoogleAudienceAPIConnector getInstance() {
        if (instance == null) {
            synchronized (GoogleAudienceAPIConnector.class) {
                if (instance == null) {
                    instance = new GoogleAudienceAPIConnector();
                }
            }
        }
        return instance;
    }

    @Override
    public void connect() {
        System.out.println("Connecting to Google Audience Partner API via Singleton Controller...");
    }

    @Override
    public void fetchData() {
        System.out.println("Fetching data from Google Audience Partner API via Singleton Controller...");
    }
}
