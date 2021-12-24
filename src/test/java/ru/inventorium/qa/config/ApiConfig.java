package ru.inventorium.qa.config;

import org.aeonbits.owner.Config;
@Config.Sources({
        "classpath:config/api.properties"
})
public interface ApiConfig extends Config{
    @Config.Key("baseUrl")
    @Config.DefaultValue("https://github.com")
    String getBaseUrl();

    @Config.Key("token")
    String getToken();
}
