package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PracticeFormPage {
    public SelenideElement
            // inputs
            firstNameItem = $("#firstName"),
            lastNameItem = $("#lastName"),
            userNumberItem = $("#userNumber"),

            // buttons
            submitItem = $("#submit"),

            // modal table
            modalTitleItem = $(".modal-title"),
            modalStudentNameItem = $(byXpath("//td[text()='Student Name']//following-sibling::td")),
            modalGenderItem = $(byXpath("//td[text()='Gender']//following-sibling::td")),
            modalMobileItem = $(byXpath("//td[text()='Mobile']//following-sibling::td"));

    public ElementsCollection
            // buttons
            genderItems = $$(byXpath("//input[@name='gender']/following-sibling::label"));
}
