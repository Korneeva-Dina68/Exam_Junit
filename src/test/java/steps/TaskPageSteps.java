package steps;

import com.codeborne.selenide.Condition;
import configuration.ConfigAllure;
import elements.TaskPageElements;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

public class TaskPageSteps extends TaskPageElements {

    @Step("Перейти в Задачи")
    public static void goTask() {
        projects.shouldBe(Condition.visible).click();
        ConfigAllure.takeScreenshot(17);
    }

    @Step("Проверить, что открылась страница с задачами")
    public static void checkGoTask() {
        Assertions.assertEquals(openTask.shouldBe(Condition.visible).getText(), "Открытые задачи");
    }

    @Step("Проверить общее количество заведенных задач в проекте")
    public static void quantityTask() {
        quantityTask.shouldBe(Condition.visible).text().substring(5);
        ConfigAllure.takeScreenshot(18);
    }
}
