package com.example.backend.designpatterns.factory.factories;

import com.example.backend.designpatterns.interfaces.APIConnector;
import com.example.backend.designpatterns.factory.connectors.TheTradeDeskAPIConnector;

public class TheTradeDeskAPIConnectorFactory extends APIConnectorFactory {
    protected APIConnector createAPIConnector() {
        return new TheTradeDeskAPIConnector();
    }
}