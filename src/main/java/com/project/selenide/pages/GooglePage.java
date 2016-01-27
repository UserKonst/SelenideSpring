package com.project.selenide.pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;
import org.openqa.selenium.By;

public class GooglePage {

    public GoogleResultPage search(String query) {
        $(By.name("q")).setValue(query).pressEnter();
        return page(GoogleResultPage.class);
    }

}
