import io.github.rikihanks.riotApi.base.RiotApi;
import io.github.rikihanks.riotApi.base.RiotApiProvider;
import io.github.rikihanks.riotApi.config.Configuration;
import io.github.rikihanks.riotApi.model.AccountDto;

import java.util.Properties;

public class Main {

    /**
     *
     * FOR DEVELOPMENT PURPOSES ONLY
     */

    public static void main(String[] args) {
        try {
            RiotApi api = RiotApiProvider.fromApiKey("RGAPI-3c7f99c4-0b88-4c8c-95d5-7a197bc7fade");
            AccountDto accountDto = api.getAccountService()
                    .getAccountByPuuId("vJ2giN8OnhKpp2Q5e_lB901WNw1L-sxQ0J8v74YQQmRVhPtZj-IRskusypeIJzCmc8qY1XsU4uwkcA");
            System.out.println(accountDto.getGameName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
