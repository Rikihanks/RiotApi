package io.github.rikihanks.riotApi.base;

/**
 * @author Richard Hernandez rikihanks.github.io
 */
public class RiotApiProvider {

    /**
     *
     * @param apiKey The API key provided from riot games developer portal
     * @return an instance of the RiotApi class to use the Riot API
     * @throws Exception if the conection to the developer portal fails or the API is incorrect
     */
    public static RiotApi fromApiKey(String apiKey) throws Exception {
        RiotApi api = new RiotApi(apiKey);
        return api;
    }
}
