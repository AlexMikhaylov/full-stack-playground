package com.example.backend.designpatterns.factory.connectors;

import com.example.backend.designpatterns.interfaces.APIConnector;

public class GoogleAudienceAPIConnector implements APIConnector {
    @Override
    public void connect(){
        System.out.println("Connecting to Google Audience Partner API via Factory Controller");
    }

    @Override
    public void fetchData() {
        System.out.println("Fetching data from Google Audience Partner API via Factory Controller");
    }
}
