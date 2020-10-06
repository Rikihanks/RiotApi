package io.github.rikihanks.riotApi.servicesImp;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.rikihanks.riotApi.config.ConfigValues;
import io.github.rikihanks.riotApi.config.Configuration;
import io.github.rikihanks.riotApi.model.AccountDto;
import io.github.rikihanks.riotApi.model.ActiveShardDto;
import io.github.rikihanks.riotApi.model.common.GameId;
import io.github.rikihanks.riotApi.services.IAccountService;
import io.github.rikihanks.riotApi.utility.HttpUtil;
import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import java.io.IOException;

public class AccountService implements IAccountService {

    private String apiKey;
    private ObjectMapper mapper = new ObjectMapper();

    public AccountService(String apiKey) {
        this.apiKey = apiKey;
    }

    public AccountDto getAccountByPuuId(String puuId) {
        AccountDto account = null;
        try {
            HttpEntity entity = HttpUtil.doGet(Configuration.getConfigByValue(ConfigValues.V1_ACCOUNTS_BY_PUUID) + puuId, apiKey);
            account = mapper.readValue(EntityUtils.toString(entity), AccountDto.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return account;
    }

    public AccountDto getAccountByRiotId(String riotId, String tagLine) {
        return null;
    }

    public ActiveShardDto getActiveShardByPuuId(String puuId, GameId id) {
        return null;
    }
}
