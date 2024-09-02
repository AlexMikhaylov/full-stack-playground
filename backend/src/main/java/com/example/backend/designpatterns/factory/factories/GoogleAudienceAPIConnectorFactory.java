package com.example.backend.designpatterns.factory.factories;

import com.example.backend.designpatterns.interfaces.APIConnector;
import com.example.backend.designpatterns.factory.connectors.GoogleAudienceAPIConnector;

public class GoogleAudienceAPIConnectorFactory extends APIConnectorFactory {
    protected APIConnector createAPIConnector() {
        return new GoogleAudienceAPIConnector();
    }
}
