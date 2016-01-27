package com.project.selenide.pages;

import static com.codeborne.selenide.Selenide.$;
import org.openqa.selenium.By;

public class GoogleResultPage {

    public String getFirstResultText() {
        String text = $(By.xpath("//*[@id='rso']//h3/a")).getText();
        return text;
    }

}
