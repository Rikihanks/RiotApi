package io.github.rikihanks.riotApi.config;

import java.io.IOException;
import java.util.Properties;

public class Configuration {

    private static Properties props;
    private static ConfigurationProvider confProvider;

    public static String getConfigByValue(String value) {
        confProvider = new ConfigurationProvider();
        try {
            props = confProvider.getProperties();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return props.getProperty(value);
    }
}
