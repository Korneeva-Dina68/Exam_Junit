import hooks.WebHooks;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static steps.CreatingTaskPageSteps.*;
import static steps.MainPageSteps.checkGoTestProject;
import static steps.MainPageSteps.goTestProject;
import static steps.ReportedByMePageSteps.*;
import static steps.TaskPageSteps.*;
import static steps.TestSeleniumPageSteps.*;

@DisplayName("Тестирование сайта edujira.ifellow.ru")
@Owner("Корнеева")
public class ClassTest extends WebHooks {

    private final String markValue = "Авторизация";
    private final String environment = "Windows 10, Google Chrome Версия 117.0.5938.89";
    private final String description = "1. Открыть сайт\n2. Ввести валидные данные зарегистрированного пользователя\n3. Нажать кнопку Войти";
    private final String subject = "Не проходит авторизация зарегистрированного пользователя";
    private final String typeTask = "Ошибка";
    private final String priorityName = "Highest";

    @DisplayName("Проверка количества заведенных задач")
    @Description("Перейти в проект TestProject и проверить общее количество заведенных задач в проекте")
    @Test()
    public void goToTestProjectTest() {
        goTestProject();
        checkGoTestProject();
        goTask();
        checkGoTask();
        quantityTask();
    }

    @DisplayName("Проверка статуса задачи и привязки в затронутой версии")
    @Description("Перейти в задачу TestSelenium и проверить статус задачи и привязку в затронутой версии")
    @Test()
    public void goToTestSeleniumTest() throws IOException {
        goTestSelenium();
        checkTestSeleniumPage();
        statusAndVersion();
    }

    @DisplayName("Создание новой задачи - ошибка")
    @Description("Создать новый баг с описанием и перевести задачу по статусам до закрытого")
    @Test()
    public void creatingNewTaskTest() {
        creatingNewTask();
        checkOpenWindowCreatingTask();
        typeTaskBug(typeTask);
        createSubject(subject);
        creatingDescription(description);
        selectInVersions1();
        createPriorityHighest(priorityName);
        createMark(markValue);
        createEnvironment(environment);
        selectAffectedVersions2();
        selectAppointMe();
        clickCreateTask();
        clickTaskHeaderblok();
        clickReportedByMe();
        checkReportedByMePage();
        clickAtWork();
        checkStatusAtWork();
        clickButtonBusinessProcess();
        clickButtonDone();
        checkStatusDone();
    }
}
