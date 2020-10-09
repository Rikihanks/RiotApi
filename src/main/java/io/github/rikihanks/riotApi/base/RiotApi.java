package io.github.rikihanks.riotApi.base;

import io.github.rikihanks.riotApi.services.IAccountService;
import io.github.rikihanks.riotApi.services.IChampionMasteryService;
import io.github.rikihanks.riotApi.services.IChampionService;
import io.github.rikihanks.riotApi.servicesImp.AccountService;
import io.github.rikihanks.riotApi.servicesImp.ChampionMasteryService;
import io.github.rikihanks.riotApi.servicesImp.ChampionService;

public class RiotApi {

    private String apiKey;
    private IAccountService accountService;
    private IChampionMasteryService championMasteryService;
    private IChampionService championService;

    public RiotApi(String apiKey) {
        this.apiKey = apiKey;
        accountService = new AccountService(apiKey);
        championMasteryService = new ChampionMasteryService(apiKey);
        championService = new ChampionService(apiKey);
    }

    public IAccountService getAccountService() {
        return accountService;
    }

    public IChampionMasteryService getChampionMasteryService() { return championMasteryService; }

    public IChampionService getChampionService() {return championService;}
}
