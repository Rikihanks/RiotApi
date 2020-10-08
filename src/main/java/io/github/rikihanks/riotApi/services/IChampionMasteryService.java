package io.github.rikihanks.riotApi.services;

import io.github.rikihanks.riotApi.model.championMastery.ChampionMasteryDto;

import java.util.List;

public interface IChampionMasteryService {

    public List<ChampionMasteryDto> getChampionsMasteryBySumonnerId(String summonerId);
    public ChampionMasteryDto getChampionMasteryByChampionId(String summonerId, Long championId);
    public int getTotalMasteryScore(String summonerId);
}
