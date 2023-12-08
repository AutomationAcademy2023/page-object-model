package Setup;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Configuration.*;

public class Config {
    public Config() {
        browserSize = "1024x768";
        screenshots = false;
        savePageSource = false;
    }


    @BeforeMethod
    public void setUpAllure(){
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true)
        );
    }
}
