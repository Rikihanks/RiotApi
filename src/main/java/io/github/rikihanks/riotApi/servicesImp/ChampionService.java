package io.github.rikihanks.riotApi.servicesImp;

import io.github.rikihanks.riotApi.model.championMastery.ChampionMasteryDto;
import io.github.rikihanks.riotApi.services.IChampionMasteryService;

import java.util.List;

public class ChampionService implements IChampionMasteryService {
    public List<ChampionMasteryDto> getChampionsMasteryBySumonnerId(String summonerId) {
        return null;
    }

    public ChampionMasteryDto getChampionMasteryByChampionId(String summonerId, Long championId) {
        return null;
    }

    public int getTotalMasteryScore(String summonerId) {
        return 0;
    }
}
