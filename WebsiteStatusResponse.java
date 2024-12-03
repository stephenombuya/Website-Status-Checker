package com.example.websitestatus.website_status_checker;

public class WebsiteStatusResponse {
    private String url;
    private boolean isOnline;
    private int responseCode;

    public WebsiteStatusResponse(String url, boolean isOnline, int responseCode) {
        this.url = url;
        this.isOnline = isOnline;
        this.responseCode = responseCode;
    }

    // Getters and setters
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }
}
