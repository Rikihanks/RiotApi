import io.github.rikihanks.riotApi.base.RiotApi;
import io.github.rikihanks.riotApi.base.RiotApiProvider;
import io.github.rikihanks.riotApi.config.Configuration;

import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        try {
            RiotApi api = RiotApiProvider.fromApiKey("miapikey");
            System.out.println(api.getApiKey());
            System.out.println(Configuration.getConfigByValue("iot"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
