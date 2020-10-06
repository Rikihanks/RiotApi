package io.github.rikihanks.riotApi.base;

import io.github.rikihanks.riotApi.services.IAccountService;
import io.github.rikihanks.riotApi.servicesImp.AccountService;

public class RiotApi {

    private String apiKey;
    private IAccountService accountService;

    public RiotApi(String apiKey) {
        this.apiKey = apiKey;
        accountService = new AccountService(apiKey);
    }

    public IAccountService getAccountService() {
        return accountService;
    }
}
