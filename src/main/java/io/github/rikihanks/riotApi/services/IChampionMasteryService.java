package io.github.rikihanks.riotApi.services;

import io.github.rikihanks.riotApi.model.championMastery.ChampionMasteryDto;

import java.util.List;

public interface IChampionMasteryService {

    /**
     *
     * @param summonerId The summonerId
     * @return List of {@link ChampionMasteryDto} containing all the championMastery asociated to this account
     */
     List<ChampionMasteryDto> getChampionsMasteryBySumonnerId(String summonerId);

    /**
     *
     * @param summonerId The summonerId
     * @param championId The id of the champion which mastery we want to obtain
     * @return {@link ChampionMasteryDto}
     */
     ChampionMasteryDto getChampionMasteryByChampionId(String summonerId, Long championId);

    /**
     *
     * @param summonerId The summonerId
     * @return java.lang.Integer which is the sum of all the total masteries
     */
     int getTotalMasteryScore(String summonerId);
}
