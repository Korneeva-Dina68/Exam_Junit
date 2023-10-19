package configuration;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Attachment;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.BeforeEach;


public class ConfigAllure {
    @Contract("_ -> new")
    @Attachment(value = "Screenshot", type = "image/png")
    @BeforeEach
    public static byte @NotNull [] takeScreenshot(int step) {
        return Selenide.screenshot("Screenshot " + step).getBytes();
    }
}

