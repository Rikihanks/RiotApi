package io.github.rikihanks.riotApi.servicesImp;

import io.github.rikihanks.riotApi.config.ConfigValues;
import io.github.rikihanks.riotApi.config.Configuration;
import io.github.rikihanks.riotApi.model.Champion.ChampionInfo;
import io.github.rikihanks.riotApi.model.championMastery.ChampionMasteryDto;
import io.github.rikihanks.riotApi.services.IChampionService;
import io.github.rikihanks.riotApi.utility.HttpUtil;
import org.apache.http.HttpEntity;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class ChampionService extends BaseService implements IChampionService {

    public ChampionService(String apiKey) {
        super(apiKey);
    }

    public ChampionInfo getChampionRotation() {
        ChampionInfo championInfo  = null;
        try {
            String url = Configuration.getConfigByValue(ConfigValues.V4_CHAMPION_CHAMP_ROTATIONS);
            HttpEntity entity = HttpUtil.doGet(url , apiKey);
            championInfo = mapper.readValue(EntityUtils.toString(entity), ChampionInfo.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return championInfo;
    }
}
