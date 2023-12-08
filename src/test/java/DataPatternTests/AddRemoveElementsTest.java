package DataPatternTests;

import Setup.Config;
import Steps.*;

import org.testng.annotations.Test;

public class AddRemoveElementsTest extends Config {

    HomeSteps homeSteps = new HomeSteps();
    AddRemoveElementsSteps addRemoveElementsSteps = new AddRemoveElementsSteps();

    @Test
    public void checkDeleteButton() {

        homeSteps.openHomePage()
                .clickAddRemoveElements();
        addRemoveElementsSteps.clickAddElementButton()
                .verifyDeleteButtonVisibility();

    }
}
