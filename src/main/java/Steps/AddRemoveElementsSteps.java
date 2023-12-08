package Steps;

import Pages.AddRemoveElementsPage;

import static com.codeborne.selenide.Condition.visible;

public class AddRemoveElementsSteps extends AddRemoveElementsPage {

    public AddRemoveElementsSteps clickAddElementButton(){
        addElementButton.click();
        return this;
    }

    public AddRemoveElementsSteps verifyDeleteButtonVisibility(){
        deleteElementButton.shouldBe(visible);
        return this;
    }
}
