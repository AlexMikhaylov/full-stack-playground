package com.example.backend.designpatterns.factory.factories;

import com.example.backend.designpatterns.factory.connectors.APIConnector;

// creator class
public abstract class APIConnectorFactory {
    protected abstract APIConnector createAPIConnector();

    // Business logic using the product object
    public void connectAndFetchData() {
        // create a product object
        APIConnector connector = createAPIConnector();
        // use the product
        connector.connect();
        connector.fetchData();
    }
}
