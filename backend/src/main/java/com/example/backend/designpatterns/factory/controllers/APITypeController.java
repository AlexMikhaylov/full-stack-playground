// APIController.java
package com.example.backend.designpatterns.factory.controllers;

import com.example.backend.designpatterns.factory.factories.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class APITypeController {

    @GetMapping("/google")
    public String connectGoogleAPI() {
        APIConnectorFactory factory = new GoogleAudienceAPIConnectorFactory();
        factory.connectAndFetchData();
        return "Connected to Google Audience API and fetched data.";
    }

    @GetMapping("/ttd")
    public String connectTTDAPI() {
        APIConnectorFactory factory = new TheTradeDeskAPIConnectorFactory();
        factory.connectAndFetchData();
        return "Connected to TTD API and fetched data.";
    }

    @GetMapping("/omnicom")
    public String connectOmnicomAPI() {
        APIConnectorFactory factory = new OmnicomAPIConnectorFactory();
        factory.connectAndFetchData();
        return "Connected to Omnicom API and fetched data.";
    }
}
