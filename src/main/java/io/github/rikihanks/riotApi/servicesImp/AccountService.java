package io.github.rikihanks.riotApi.servicesImp;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.rikihanks.riotApi.config.ConfigValues;
import io.github.rikihanks.riotApi.config.Configuration;
import io.github.rikihanks.riotApi.model.account.AccountDto;
import io.github.rikihanks.riotApi.model.account.ActiveShardDto;
import io.github.rikihanks.riotApi.model.common.GameId;
import io.github.rikihanks.riotApi.services.IAccountService;
import io.github.rikihanks.riotApi.utility.HttpUtil;
import org.apache.http.HttpEntity;
import org.apache.http.util.EntityUtils;
import java.io.IOException;

public class AccountService extends BaseService implements IAccountService {


    public AccountService(String apiKey) {
        super(apiKey);
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
        AccountDto account = null;
        try {
            String url = Configuration.getConfigByValue(ConfigValues.V1_ACCOUTS_BY_PUUID)
                    .replace("{gameName}", riotId)
                    .replace("{tagLine}", tagLine);
            HttpEntity entity = HttpUtil.doGet(url , apiKey);
            account = mapper.readValue(EntityUtils.toString(entity), AccountDto.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return account;
    }

    public ActiveShardDto getActiveShardByPuuId(String puuId, GameId id) {
        ActiveShardDto activeShardDto = null;
        try {
            String url = Configuration.getConfigByValue(ConfigValues.V1_ACCOUNTS_ACTIVESHARDS_BY_GAME)
                    .replace("{game}", id.name())
                    .replace("{puuid}", puuId);
            HttpEntity entity = HttpUtil.doGet(url , apiKey);
            activeShardDto = mapper.readValue(EntityUtils.toString(entity), ActiveShardDto.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return activeShardDto;
    }
}
