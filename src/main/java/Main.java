import io.github.rikihanks.riotApi.base.RiotApi;
import io.github.rikihanks.riotApi.base.RiotApiProvider;
import io.github.rikihanks.riotApi.model.account.ActiveShardDto;
import io.github.rikihanks.riotApi.model.common.GameId;

public class Main {

    /**
     *
     * FOR DEVELOPMENT PURPOSES ONLY
     */

    public static void main(String[] args) {
        try {
            RiotApi api = RiotApiProvider.fromApiKey("");
            ActiveShardDto activeShardDto = api.getAccountService()
                    .getActiveShardByPuuId("", GameId.val);
            System.out.println(activeShardDto.getActiveShard());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
