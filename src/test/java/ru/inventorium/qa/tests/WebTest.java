package ru.inventorium.qa.tests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static ru.inventorium.qa.config.Browser.*;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import ru.inventorium.qa.config.WebDriverConfig;

public class WebTest {

    @Test
    public void webChromeLocaleFileTest() {
        System.setProperty("environment", "local");
        WebDriverConfig webDriverConfig = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

        assertThat(webDriverConfig.getBrowser()).isEqualTo(CHROME);
        assertThat(webDriverConfig.getBrowserVersion()).isEqualTo("91.0");
        assertThat(webDriverConfig.getBrowserSize()).isEqualTo("1920x1080");
    }

    @Test
    public void webSelenoidFileTest() {
        System.setProperty("environment", "remote");
        WebDriverConfig webDriverConfig = ConfigFactory.create(WebDriverConfig.class,
                System.getProperties());

        assertThat(webDriverConfig.getBrowser()).isEqualTo(FIREFOX);
        assertThat(webDriverConfig.getBrowserVersion()).isEqualTo("91.0");
        assertThat(webDriverConfig.getBrowserSize()).isEqualTo("1024x768");
        assertThat(webDriverConfig.getRemoteWebDriver()).isEqualTo(
                "https://user1:1234@selenoid.autotests.cloud/wd/hub/");

    }

    @Test
    public void webDefaultValuesTest() {
        WebDriverConfig webDriverConfig = ConfigFactory.create(WebDriverConfig.class,
                System.getProperties());
        assertThat(webDriverConfig.getBrowser()).isEqualTo(CHROME);
        assertThat(webDriverConfig.getBrowserVersion()).isEqualTo("95.0");
        assertThat(webDriverConfig.getBrowserSize()).isEqualTo("1920x1080");
    }
}
