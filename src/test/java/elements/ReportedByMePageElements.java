package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ReportedByMePageElements {
    public static SelenideElement taskHeaderblok = $x("//a[@title='Поиск и просмотр недавних задач']").as("Кнопка Задачи в шапке");
    public static SelenideElement reportedByMe = $x("//li[@id='filter_lnk_reported']").as("Сообщенные мной");
    public static SelenideElement reportedByMeText = $x("//h1[@title='Сообщенные мной']").as("Текст для проверки");
    public static SelenideElement atWork = $x("//div[@id='opsbar-opsbar-transitions']//span[text()='В работе']").as("В работе");
    public static SelenideElement status = $x("//span[@id='status-val']").as("Статус");
    public static SelenideElement businessProcess = $x("//span[text()='Бизнес-процесс']").as("Кнопка Бизнесс-процесс");
    public static SelenideElement doneButton = $x("//a[@role='menuitem']//span[text()='Выполнено']").as("Кнопка Выполнено");
}
