package Steps;

import Pages.HomePage;
import com.codeborne.selenide.Selenide;

public class HomeSteps {
    HomePage homePage = new HomePage();

    public HomeSteps openHomePage(){
        Selenide.open("https://demoqa.com/");
        return this;
    }

    public void clickForms(){
        homePage.formsItem.scrollTo().click();
    }
}
