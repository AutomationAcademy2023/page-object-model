package Steps;

import Pages.FormsPage;

public class FormsSteps {
    FormsPage formsPage = new FormsPage();

    public void clickPracticeForm(){
        formsPage.practiceFormItem.click();
    }
}
