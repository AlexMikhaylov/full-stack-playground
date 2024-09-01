package com.example.backend.designpatterns.factory.connectors;

public class OmnicomAPIConnector implements APIConnector {
    @Override
    public void connect(){
        System.out.println("Connecting to Omnicom API");
    }

    @Override
    public void fetchData() {
        System.out.println("Fetching data from Omnicom API");
    }
}
