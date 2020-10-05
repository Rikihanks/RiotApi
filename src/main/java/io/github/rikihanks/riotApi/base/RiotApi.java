package io.github.rikihanks.riotApi.base;

public class RiotApi {

    private String apiKey;

    public RiotApi(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
