package steps;

import com.codeborne.selenide.Condition;
import elements.AutorizationPageElements;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.sleep;

public class AutorizationPageSteps extends AutorizationPageElements {
    @Step("Авторизация пользователем {login} {passwordUser}")
    public static void autorization(String login, String passwordUser) {
        userName.shouldBe(Condition.visible).sendKeys(login);
        sleep(1000);
        password.shouldBe(Condition.visible).sendKeys(passwordUser);
        buttonEnter.shouldBe(Condition.visible).click();
    }
@Step("Проверить, что прошла авторизация")
    public static void checkAutorization() {
        userOptions.shouldBe(Condition.visible, Duration.ofSeconds(10)).click();
        sleep(2000);
        Assertions.assertEquals(exit.getText(), "Выйти");
    }
}
