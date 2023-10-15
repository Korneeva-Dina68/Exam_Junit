package steps;

import com.codeborne.selenide.Condition;
import elements.MainPageElements;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

public class MainPageSteps extends MainPageElements {
    @Step("Перейти в ТестПроджект")
    public static void goTestProject() {
        projects.shouldBe(Condition.visible).click();
        projects.shouldBe(Condition.visible).click();
        testProjects.shouldBe(Condition.visible).click();
    }

    @Step("Проверить, что открылась страница ТестПроджекта")
    public static void checkGoTestProject() {
        Assertions.assertEquals(task.shouldBe(Condition.visible).getText(), "Посмотреть все задачи и фильтры");
    }
}
