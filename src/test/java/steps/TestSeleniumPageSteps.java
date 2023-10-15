package steps;

import com.codeborne.selenide.Condition;
import elements.TestSeleniumPageElements;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.sleep;

public class TestSeleniumPageSteps extends TestSeleniumPageElements {

    @Step("Перейти в задачу ТестСелениум")
    public static void goTestSelenium() {
        searchInput.shouldBe(Condition.visible).setValue("TestSelenium");
        testSelenium.shouldBe(Condition.visible).click();
    }

    @Step("Проверить, что открылась страница задачи ТестСелениума")
    public static void checkTestSeleniumPage() {
        Assertions.assertEquals(checkTestSelenium.shouldBe(Condition.visible).getText(), "TestSelenium");
    }

    @Step("Проверить статус задачи и привязку в затронутой версии")
    public static void statusAndVersion() {
        Assertions.assertEquals(status.shouldBe(Condition.visible).getText(), "СДЕЛАТЬ");
        Assertions.assertEquals(version.shouldBe(Condition.visible).getText(), "Version 2.0");
        sleep(5000);
    }
}
