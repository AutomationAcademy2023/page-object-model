package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {
    public final SelenideElement
           addRemoveElements = $("a[href='/add_remove_elements/']");
}
