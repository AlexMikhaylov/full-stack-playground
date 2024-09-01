package com.example.backend.designpatterns.factory.connectors;

public class TheTradeDeskAPIConnector implements APIConnector {
    @Override
    public void connect(){
        System.out.println("Connecting to The Trade Desk API");
    }

    @Override
    public void fetchData() {
        System.out.println("Fetching data from The Trade Desk API");
    }
}
