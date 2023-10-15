package hooks;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import properties.ConfigProperties;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static steps.AutorizationPageSteps.autorization;
import static steps.AutorizationPageSteps.checkAutorization;

public class WebHooks {
    @AfterEach
    void tearDown() {
        Selenide.clearBrowserLocalStorage();
        Selenide.clearBrowserCookies();
        WebDriverRunner.clearBrowserCache();
    }

    @BeforeEach
    void setUp() {
        open(ConfigProperties.getProperty("url"));
        getWebDriver().manage().window().maximize();
        autorization(ConfigProperties.getProperty("login"), ConfigProperties.getProperty("password"));
        checkAutorization();
    }
}
