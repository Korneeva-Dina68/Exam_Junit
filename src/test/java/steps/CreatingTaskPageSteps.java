package steps;

import com.codeborne.selenide.Condition;
import elements.CreatingTaskPageElements;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;

public class CreatingTaskPageSteps extends CreatingTaskPageElements {
    @Step("Нажать Создать задачу")
    public static void creatingNewTask() {
        createButton.shouldBe(Condition.visible).click();
    }

    @Step("Проверить, что открылось окно с созданием задачи")
    public static void checkOpenWindowCreatingTask() {
        Assertions.assertEquals(checkCreateButton.shouldBe(Condition.visible).getText(), "Создание задачи");
    }

    @Step("Выбрать тип ошибки {typeTaskName}")
    public static void typeTaskBug(String typeTaskName) {
        typeTask.shouldBe(Condition.visible).doubleClick().sendKeys(Keys.DELETE);
        typeTask.shouldBe(Condition.visible).sendKeys(typeTaskName);
        typeTask.shouldBe(Condition.visible).sendKeys(Keys.ENTER);
    }

    @Step("Написать название темы {subject}")
    public static void createSubject(String subject) {
        formSubject.shouldBe(Condition.visible).sendKeys(subject);
    }

    @Step("Заполнить Описание {description}")
    public static void creatingDescription(String description) {
        formDescription.shouldBe(Condition.visible).setValue(description);
    }

    @Step("Выбрать версию в Исправить в версиях")
    public static void selectInVersions1() {
        formVersion1.shouldBe(Condition.visible).click();
    }

    @Step("Выбрать Приоритет {priorityName}")
    public static void createPriorityHighest(String priorityName) {
        priority.shouldBe(Condition.visible).doubleClick().sendKeys(Keys.DELETE);
        priority.shouldBe(Condition.visible).sendKeys(priorityName);
        priority.shouldBe(Condition.visible).sendKeys(Keys.ENTER);
    }

    @Step("Создать метку {markValue}")
    public static void createMark(String markValue) {
        mark.shouldBe(Condition.visible).doubleClick().setValue(markValue);
        mark.shouldBe(Condition.visible).pressEnter();
    }

    @Step("Заполнить Описание {environment}")
    public static void createEnvironment(String environment) {
        formEnvironment.shouldBe(Condition.visible).sendKeys(environment);
    }

    @Step("Выбрать версию в Затронуты версии")
    public static void selectAffectedVersions2() {
        affectedVersions2.shouldBe(Condition.visible).click();
    }

    @Step("Выбрать Исполнителем Себя")
    public static void selectAppointMe() {
        appointMeButton.shouldBe(Condition.visible).click();
    }

    @Step("Нажать кнопку Создать задачу")
    public static void clickCreateTask() {
        buttonCreateTask.shouldBe(Condition.visible).click();
    }
}
