package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class AddRemoveElementsPage {

    public final SelenideElement
            addElementButton = $("button[onclick='addElement()']");

    public final SelenideElement
            deleteElementButton = $("button[onclick='deleteElement()']");

}
