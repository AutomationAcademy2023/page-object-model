package Steps;

import Pages.AddRemoveElementsPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;

public class AddRemoveElementsSteps extends AddRemoveElementsPage {

    @Step
    public AddRemoveElementsSteps clickAddElementButton(){
        addElementButton.click();
        return this;
    }
    @Step("Verify that Delete Button is not visible on the page")
    public AddRemoveElementsSteps verifyDeleteButtonInvisibility(){
        deleteElementButton.shouldNotBe(visible);
        return this;
    }
}
