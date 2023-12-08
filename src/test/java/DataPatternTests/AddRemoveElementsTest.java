package DataPatternTests;

import Setup.Config;
import Steps.*;

import io.qameta.allure.*;
import org.testng.annotations.Test;


public class AddRemoveElementsTest extends Config {

    HomeSteps homeSteps = new HomeSteps();
    AddRemoveElementsSteps addRemoveElementsSteps = new AddRemoveElementsSteps();

    @Feature("Add Element Button")
    @Story("Element not added")
    @Description("Verifying element is not added after clicking Add Element button")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void checkDeleteButton() {

        homeSteps.openHomePage()
                .clickAddRemoveElements();
        addRemoveElementsSteps.clickAddElementButton()
                .verifyDeleteButtonInvisibility();

    }
}
