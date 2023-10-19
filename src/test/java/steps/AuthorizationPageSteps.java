package steps;

import com.codeborne.selenide.Condition;
import configuration.ConfigAllure;
import elements.AutorizationPageElements;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;
import java.time.Duration;

import static com.codeborne.selenide.Selenide.sleep;

public class AuthorizationPageSteps extends AutorizationPageElements {
    @Step("Авторизация пользователем {login} {passwordUser}")
    public static void authorization(String login, String passwordUser) throws IOException {
        userName.shouldBe(Condition.visible).sendKeys(login);
        sleep(1000);
        password.shouldBe(Condition.visible).sendKeys(passwordUser);
        buttonEnter.shouldBe(Condition.visible).click();
        ConfigAllure.takeScreenshot(1);
    }

    @Step("Проверить, что прошла авторизация")
    public static void checkAuthorization() {
        userOptions.shouldBe(Condition.visible, Duration.ofSeconds(10)).click();
        sleep(2000);
        Assertions.assertEquals(exit.getText(), "Выйти");
    }
}
