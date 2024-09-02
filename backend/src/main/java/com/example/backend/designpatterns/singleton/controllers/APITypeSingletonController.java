package com.example.backend.designpatterns.singleton.controllers;

import com.example.backend.designpatterns.singleton.connectors.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/singleton")
public class APITypeSingletonController {
    @GetMapping("/google")
    public String connectGoogleAPI() {
        GoogleAudienceAPIConnector connector = GoogleAudienceAPIConnector.getInstance();
        connector.connect();
        connector.fetchData();
        return "Connected to Google Audience API and fetched data via Singleton Controller.";
    }

    @GetMapping("/ttd")
    public String connectTTDAPI() {
        TheTradeDeskAPIConnector connector = TheTradeDeskAPIConnector.getInstance();
        connector.connect();
        connector.fetchData();
        return "Connected to The Trade Desk Contextual API and fetched data via Singleton Controller.";
    }

    @GetMapping("/omnicom")
    public String connectOmnicomAPI() {
        OmnicomAPIConnector connector = OmnicomAPIConnector.getInstance();
        connector.connect();
        connector.fetchData();
        return "Connected to Omnicom API and fetched data via Singleton Controller.";
    }
}
