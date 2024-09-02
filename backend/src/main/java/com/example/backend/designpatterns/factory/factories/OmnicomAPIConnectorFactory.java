package com.example.backend.designpatterns.factory.factories;

import com.example.backend.designpatterns.interfaces.APIConnector;
import com.example.backend.designpatterns.factory.connectors.OmnicomAPIConnector;

public class OmnicomAPIConnectorFactory extends APIConnectorFactory {
    protected APIConnector createAPIConnector() {
        return new OmnicomAPIConnector();
    }
}