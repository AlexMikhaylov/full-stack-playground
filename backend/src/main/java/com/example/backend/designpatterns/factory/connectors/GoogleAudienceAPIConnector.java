package com.example.backend.designpatterns.factory.connectors;

public class GoogleAudienceAPIConnector implements APIConnector {
    @Override
    public void connect(){
        System.out.println("Connecting to Google Audience Partner API");
    }

    @Override
    public void fetchData() {
        System.out.println("Fetching data from Google Audience Partner API");
    }
}
