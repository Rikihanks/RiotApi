package io.github.rikihanks.riotApi.base;

import io.github.rikihanks.riotApi.services.IAccountService;
import io.github.rikihanks.riotApi.services.IChampionMasteryService;
import io.github.rikihanks.riotApi.services.IChampionService;
import io.github.rikihanks.riotApi.services.IClashService;
import io.github.rikihanks.riotApi.servicesImp.AccountService;
import io.github.rikihanks.riotApi.servicesImp.ChampionMasteryService;
import io.github.rikihanks.riotApi.servicesImp.ChampionService;
import io.github.rikihanks.riotApi.servicesImp.ClashService;

public class RiotApi {

    private String apiKey;
    private IAccountService accountService;
    private IChampionMasteryService championMasteryService;
    private IChampionService championService;
    private IClashService clashService;

    public RiotApi(String apiKey) {
        this.apiKey = apiKey;
        accountService = new AccountService(apiKey);
        championMasteryService = new ChampionMasteryService(apiKey);
        championService = new ChampionService(apiKey);
        clashService = new ClashService(apiKey);
    }

    public IAccountService getAccountService() {
        return accountService;
    }

    public IChampionMasteryService getChampionMasteryService() { return championMasteryService; }

    public IChampionService getChampionService() {return championService;}

    public IClashService getClashService() {  return clashService; }
}
