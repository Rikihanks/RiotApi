package io.github.rikihanks.riotApi.services;

import io.github.rikihanks.riotApi.model.account.AccountDto;
import io.github.rikihanks.riotApi.model.account.ActiveShardDto;
import io.github.rikihanks.riotApi.model.common.GameId;

public interface IAccountService {

    /**
     *
     * @param puuId The puuid asociated to the account
     * @return AccountDto
     */
     AccountDto getAccountByPuuId(String puuId);

    /**
     *
     * @param riotId The riotId associated to the account
     * @param tagLine The account's tagLine, ex: #EUW
     * @return
     */
     AccountDto getAccountByRiotId(String riotId, String tagLine);

    /**
     *
     * @param puuId The puuid asociated to the account
     * @param id The GameId. Values can be retrieved using the GameId enum.
     * @return
     */
     ActiveShardDto getActiveShardByPuuId(String puuId, GameId id);
}
