package com.example.backend.designpatterns.singleton.connectors;


import com.example.backend.designpatterns.interfaces.APIConnector;

public class TheTradeDeskAPIConnector implements APIConnector {
    private static volatile TheTradeDeskAPIConnector instance;

    private TheTradeDeskAPIConnector() {}

    public static TheTradeDeskAPIConnector getInstance() {
        if (instance == null) {
            synchronized (TheTradeDeskAPIConnector.class) {
                if (instance == null) {
                    instance = new TheTradeDeskAPIConnector();
                }
            }
        }
        return instance;
    }

    @Override
    public void connect() {
        System.out.println("Connecting to The Trade Desk API via Singleton Controller...");
    }

    @Override
    public void fetchData() {
        System.out.println("Fetching data from The Trade Desk API via Singleton Controller...");
    }
}
