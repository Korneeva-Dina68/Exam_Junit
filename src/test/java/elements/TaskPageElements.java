package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TaskPageElements {
    public static SelenideElement projects = $x("//a[@id='browse_link']").as("Кнопка Проекты в шапке");
    public static SelenideElement openTask = $x("//span[text()='Открытые задачи']").as("Текст для проверки");
    public static SelenideElement quantityTask = $x("//div[@class='showing']//span").as("Количество задач");
}
