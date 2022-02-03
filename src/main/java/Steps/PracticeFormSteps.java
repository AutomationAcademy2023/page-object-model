package Steps;

import Data.PracticeFormData;
import Pages.PracticeFormPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class PracticeFormSteps {
    PracticeFormPage practiceFormPage = new PracticeFormPage();
    PracticeFormData practiceFormData = new PracticeFormData();

    /* INPUTS */
    public PracticeFormSteps setFirstName() {
        practiceFormPage.firstNameItem.setValue(practiceFormData.firstName);
        return this;
    }

    public PracticeFormSteps setLastName() {
        practiceFormPage.lastNameItem.setValue(practiceFormData.lastName);
        return this;
    }

    public PracticeFormSteps setUserNumber() {
        practiceFormPage.userNumberItem.setValue(practiceFormData.userNumber);
        return this;
    }

    /* BUTTONS */
    public PracticeFormSteps setGender() {
        for(SelenideElement el : practiceFormPage.genderItems){
            if(el.getText().equalsIgnoreCase(practiceFormData.gender)){
                el.click();
                break;
            }
        }
        return this;
    }

    public PracticeFormSteps clickSubmit() {
        practiceFormPage.submitItem.scrollTo().click();
        return this;
    }

    /* MODAL VALIDATION */
    public PracticeFormSteps validateSubmitText() {
        practiceFormPage.modalTitleItem.shouldHave(Condition.text("Thanks for submitting the form"));
        return this;
    }

    public PracticeFormSteps validateStudentName() {
        practiceFormPage.modalStudentNameItem.shouldHave(Condition.text(practiceFormData.firstName + ' '
                + practiceFormData.lastName));
        return this;
    }

    public PracticeFormSteps validateGender() {
        practiceFormPage.modalGenderItem.shouldHave(Condition.text(practiceFormData.gender));
        return this;
    }

    public PracticeFormSteps validateMobile() {
        practiceFormPage.modalMobileItem.shouldHave(Condition.text(practiceFormData.userNumber));
        return this;
    }
}
