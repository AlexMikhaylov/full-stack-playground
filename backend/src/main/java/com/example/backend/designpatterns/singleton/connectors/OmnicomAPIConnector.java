package com.example.backend.designpatterns.singleton.connectors;

import com.example.backend.designpatterns.interfaces.APIConnector;

public class OmnicomAPIConnector implements APIConnector {
    private static volatile OmnicomAPIConnector instance;

    private OmnicomAPIConnector() {}

    public static OmnicomAPIConnector getInstance() {
        if (instance == null) {
            synchronized (OmnicomAPIConnector.class) {
                if (instance == null) {
                    instance = new OmnicomAPIConnector();
                }
            }
        }
        return instance;
    }

    @Override
    public void connect() {
        System.out.println("Connecting to Omnicom API via Singleton Controller...");
    }

    @Override
    public void fetchData() {
        System.out.println("Fetching data from Omnicom API via Singleton Controller...");
    }
}