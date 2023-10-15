package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CreatingTaskPageElements {
    public static SelenideElement createButton = $x("//li[@id='create-menu']").as("Кнопка Создать в шапке");
    public static SelenideElement checkCreateButton = $x("//h2[text()='Создание задачи']").as("Текст для проверки");
    public static SelenideElement typeTask = $x("//input[@id='issuetype-field']").as("Тип задачи");
    public static SelenideElement formSubject = $x("//input[@id='summary']").as("Тема");
    public static SelenideElement formDescription = $x("//textarea[@id='description']").as("Описание");
    public static SelenideElement formVersion1 = $x("//option[@value='10000']").as("Исправить в версиях");
    public static SelenideElement priority = $x("//input[@id='priority-field']").as("Приоритет");
    public static SelenideElement mark = $x("//div[@id='labels-multi-select']//textarea").as("Метка");
    public static SelenideElement formEnvironment = $x("//textarea[@id='environment']").as("Окружение");
    public static SelenideElement affectedVersions2 = $x("//select[@id='versions']//option[@value='10001']").as("Затронуты версии");
    public static SelenideElement appointMeButton = $x("//button[text()='Назначить меня']").as("Назначить меня");
    public static SelenideElement buttonCreateTask = $x("//input[@name='Edit']").as("Кнопка Создать задачу");
}
