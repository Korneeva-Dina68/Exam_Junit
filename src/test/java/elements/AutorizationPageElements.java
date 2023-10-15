package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AutorizationPageElements {
    public static SelenideElement userName = $x("//input[@name='os_username']").as("Форма ввода логина");
    public static SelenideElement password = $x("//input[@name='os_password']").as("Форма ввода пароля");
    public static SelenideElement buttonEnter = $x("//input[@value='Войти']").as("Кнопка Войти");
    public static SelenideElement userOptions = $x("//a[@id='header-details-user-fullname']").as("Кнопка профиля");
    public static SelenideElement exit = $x("//div[@class='aui-dropdown2-section']//a[text()='Выйти']").as("Кнопка Выйти");
}
