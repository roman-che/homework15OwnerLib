package ru.inventorium.qa.config;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.Sources("classpath:config/${environment}.properties")
public interface WebDriverConfig extends Config {

    @Key("browser")
    @DefaultValue("CHROME")
    Browser getBrowser();

    @Key("browserVersion")
    @DefaultValue("95.0")
    String getBrowserVersion();

    @Key("remoteUrl")
    URL getRemoteUrl();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();

    @Key("remoteWebDriver")
    String getRemoteWebDriver();
}