package io.github.rikihanks.riotApi.servicesImp;

import io.github.rikihanks.riotApi.config.ConfigValues;
import io.github.rikihanks.riotApi.config.Configuration;
import io.github.rikihanks.riotApi.model.championMastery.ChampionMasteryDto;
import io.github.rikihanks.riotApi.services.IChampionMasteryService;
import io.github.rikihanks.riotApi.utility.HttpUtil;
import org.apache.http.HttpEntity;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChampionMasteryService extends BaseService implements IChampionMasteryService {

    public ChampionMasteryService(String apiKey) {
        super(apiKey);
    }

    public List<ChampionMasteryDto> getChampionsMasteryBySumonnerId(String summonerId) {
        ChampionMasteryDto championMasteryDtos [] = null;
        try {
            String url = Configuration.getConfigByValue(ConfigValues.V4_CHAMPION_MASTERY_BY_SUMMONER_ID)
                    .replace("{encryptedSummonerId}", summonerId);
            HttpEntity entity = HttpUtil.doGet(url , apiKey);
            championMasteryDtos = mapper.readValue(EntityUtils.toString(entity), ChampionMasteryDto[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<ChampionMasteryDto>(Arrays.asList(championMasteryDtos));
    }

    public ChampionMasteryDto getChampionMasteryByChampionId(String summonerId, Long championId) {
        ChampionMasteryDto championMasteryDto  = null;
        try {
            String url = Configuration.getConfigByValue(ConfigValues.V4_CHAMPION_MASTERY_BY_CHAMPION_ID)
                    .replace("{encryptedSummonerId}", summonerId)
                    .replace("{championId}", String.valueOf(championId));
            HttpEntity entity = HttpUtil.doGet(url , apiKey);
            championMasteryDto = mapper.readValue(EntityUtils.toString(entity), ChampionMasteryDto.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return championMasteryDto;
    }

    public int getTotalMasteryScore(String summonerId) {
        int mastery = 0;
        try {
            String url = Configuration.getConfigByValue(ConfigValues.V4_CHAMPION_MASTERY_TOTAL_MASTERY)
                    .replace("{encryptedSummonerId}", summonerId);
            HttpEntity entity = HttpUtil.doGet(url , apiKey);
             mastery = mapper.readValue(EntityUtils.toString(entity), Integer.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mastery;
    }
}
