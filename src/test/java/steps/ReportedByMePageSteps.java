package steps;

import com.codeborne.selenide.Condition;
import elements.ReportedByMePageElements;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.sleep;

public class ReportedByMePageSteps extends ReportedByMePageElements {

    @Step("Кликнуть Задачи в шапке страницы")
    public static void clickTaskHeaderblok() {
        taskHeaderblok.shouldBe(Condition.visible).click();
    }

    @Step("Кликнуть Сообщенные мной")
    public static void clickReportedByMe() {
        reportedByMe.shouldBe(Condition.visible).click();
    }

    @Step("Проверить, что открылась страница с задачами, сообщенными пользователем")
    public static void checkReportedByMePage() {
        Assertions.assertEquals(reportedByMeText.shouldBe(Condition.visible).getText(), "Сообщенные мной");
    }

    @Step("Нажать кнопку В работе")
    public static void clickAtWork() {
        atWork.shouldBe(Condition.visible).click();
        sleep(2000);
    }

    @Step("Проверить, что статус В работе")
    public static void checkStatusAtWork() {
        Assertions.assertEquals("В РАБОТЕ", status.shouldBe(Condition.visible).getText());
    }

    @Step("Нажать кнопку Бизнесс-процесс")
    public static void clickButtonBusinessProcess() {
        businessProcess.shouldBe(Condition.visible).click();
        sleep(2000);
    }

    @Step("Выбрать пункт Выполнено")
    public static void clickButtonDone() {
        doneButton.shouldBe(Condition.visible).click();
        sleep(2000);
    }

    @Step("Проверить, что статус Готово")
    public static void checkStatusDone() {
        Assertions.assertEquals("ГОТОВО", status.shouldBe(Condition.visible).getText());
    }
}
