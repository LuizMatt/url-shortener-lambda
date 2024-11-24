package com.rocketseat.redirectUrlShortner;

public class UrlData {

    private String originalUrl;
    private long expirationTime;

    public UrlData(String originalUrl, long expirationTime) {
        this.originalUrl = originalUrl;
        this.expirationTime = expirationTime;
    }
    public UrlData() {
    }


    public String getOriginalUrl() {
        return originalUrl;
    }

    public long getExpirationTime() {
        return expirationTime;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public void setExpirationTime(long expirationTime) {
        this.expirationTime = expirationTime;
    }
}
