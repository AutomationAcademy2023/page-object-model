package Steps;

import Data.Variables;
import Pages.HomePage;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

public class HomeSteps extends HomePage {
    @Step
    public HomeSteps openHomePage(){
        Selenide.open(new Variables().URL);
        return this;
    }
    @Step
    public HomeSteps clickAddRemoveElements(){
        addRemoveElements.click();
        return this;
    }
}
