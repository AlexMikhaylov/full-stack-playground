package com.example.backend.designpatterns.factory.connectors;

import com.example.backend.designpatterns.interfaces.APIConnector;

public class TheTradeDeskAPIConnector implements APIConnector {
    @Override
    public void connect(){
        System.out.println("Connecting to The Trade Desk API via Factory Controller");
    }

    @Override
    public void fetchData() {
        System.out.println("Fetching data from The Trade Desk API via Factory Controller");
    }
}
