package DataPatternTests;

import Steps.*;

import org.testng.annotations.Test;

public class FormTest extends Config{

    PracticeFormSteps practiceFormSteps = new PracticeFormSteps();
    HomeSteps homeSteps = new HomeSteps();
    FormsSteps formsSteps = new FormsSteps();

    @Test
    public void fillForm(){

        homeSteps.openHomePage()
                .clickForms();

        formsSteps.clickPracticeForm();

        practiceFormSteps.setFirstName()
                .setLastName()
                .setGender()
                .setUserNumber()
                .clickSubmit()
                .validateSubmitText()
                .validateStudentName()
                .validateGender()
                .validateMobile();
    }
}
