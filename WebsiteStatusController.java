package com.example.websitestatus.website_status_checker;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.HttpURLConnection;
import java.net.URL;

@RestController
public class WebsiteStatusController {

    @GetMapping("/check-status")
    public ResponseEntity<WebsiteStatusResponse> checkWebsiteStatus(@RequestParam String websiteUrl) {
        try {
            URL url = new URL(websiteUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int responseCode = connection.getResponseCode();
            boolean isOnline = (responseCode == HttpURLConnection.HTTP_OK);

            WebsiteStatusResponse response = new WebsiteStatusResponse(
                websiteUrl, 
                isOnline, 
                responseCode
            );

            connection.disconnect();
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            WebsiteStatusResponse response = new WebsiteStatusResponse(
                websiteUrl, 
                false, 
                404
            );
            return ResponseEntity.ok(response);
        }
    }
}
