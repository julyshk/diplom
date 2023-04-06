package config;

import org.aeonbits.owner.Config;

//@Config.Sources({
//        "classpath:${env}.properties"
//})

public interface WebDriverConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://drom.ru")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("version")
    @DefaultValue("100.0")
    String getVersion();

    @Key("remoteUrl")
    String getRemoteURL();
}
