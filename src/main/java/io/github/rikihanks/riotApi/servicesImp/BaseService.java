package io.github.rikihanks.riotApi.servicesImp;

import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class BaseService {

    protected String apiKey;
    protected ObjectMapper mapper = new ObjectMapper();

    public BaseService(String apiKey) {
        this.apiKey = apiKey;
    }
}
