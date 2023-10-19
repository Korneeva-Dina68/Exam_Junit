package steps;

import com.codeborne.selenide.Condition;
import configuration.ConfigAllure;
import elements.TestSeleniumPageElements;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.sleep;

public class TestSeleniumPageSteps extends TestSeleniumPageElements {

    @Step("Перейти в задачу ТестСелениум")
    public static void goTestSelenium() throws IOException {
        searchInput.shouldBe(Condition.visible).setValue("TestSelenium");
        testSelenium.shouldBe(Condition.visible).click();
        ConfigAllure.takeScreenshot(19);
    }

    @Step("Проверить, что открылась страница задачи ТестСелениума")
    public static void checkTestSeleniumPage() throws IOException {
        Assertions.assertEquals(checkTestSelenium.shouldBe(Condition.visible).getText(), "TestSelenium");
    }

    @Step("Проверить статус задачи и привязку в затронутой версии")
    public static void statusAndVersion() throws IOException {
        Assertions.assertEquals(status.shouldBe(Condition.visible).getText(), "СДЕЛАТЬ");
        Assertions.assertEquals(version.shouldBe(Condition.visible).getText(), "Version 2.0");
        sleep(5000);
        ConfigAllure.takeScreenshot(20);
    }
}
