package Steps;

import Data.Variables;
import Pages.HomePage;
import com.codeborne.selenide.Selenide;

public class HomeSteps extends HomePage {

    public HomeSteps openHomePage(){
        Selenide.open(new Variables().URL);
        return this;
    }

    public HomeSteps clickAddRemoveElements(){
        addRemoveElements.click();
        return this;
    }
}
