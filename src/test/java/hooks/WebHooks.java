package hooks;


import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import configuration.ConfigAllure;
import configuration.ConfigProperties;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static steps.AuthorizationPageSteps.authorization;
import static steps.AuthorizationPageSteps.checkAuthorization;

public class WebHooks {
    @AfterEach
    void tearDown() {
        Selenide.clearBrowserLocalStorage();
        Selenide.clearBrowserCookies();
        WebDriverRunner.clearBrowserCache();
    }

    @BeforeEach
    void setUp() throws IOException {
        open(ConfigProperties.getProperty("url"));
        getWebDriver().manage().window().maximize();
        String listenerName = "AllureSelenide";
        if (!(SelenideLogger.hasListener(listenerName)))
            SelenideLogger.addListener(listenerName,
                    (new AllureSelenide().screenshots(true).savePageSource(true)));
        authorization(ConfigProperties.getProperty("login"), ConfigProperties.getProperty("password"));
        checkAuthorization();
    }
}
