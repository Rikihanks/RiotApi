package io.github.rikihanks.riotApi.utility;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class HttpUtil {
    public static HttpEntity doGet(String url, String apiKey) throws IOException {
        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet request = new HttpGet(url);
        request.addHeader("X-Riot-Token", apiKey);
        CloseableHttpResponse response = client.execute(request);
        return response.getEntity();
    }
}
