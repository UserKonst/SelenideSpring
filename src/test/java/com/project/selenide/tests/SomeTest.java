package com.project.selenide.tests;

import static com.codeborne.selenide.Selenide.open;
import com.project.selenide.pages.GooglePage;
import com.project.selenide.pages.GoogleResultPage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class SomeTest extends AbstractTestNGSpringContextTests {

    @Value("${expectedText}")
    private String expectedText;

    GooglePage googlePage;
    GoogleResultPage resultPage;

    @Test
    public void negetiveTest() {
        googlePage = open("https://www.google.com.ua", GooglePage.class);
        resultPage = googlePage.search(expectedText);
        String actualText = resultPage.getFirstResultText();

        assertEquals(actualText, "git установка");

    }

    @Test
    public void positiveTest() {
        googlePage = open("https://www.google.com.ua", GooglePage.class);
        resultPage = googlePage.search(expectedText);
        String actualText = resultPage.getFirstResultText();

        assertEquals(actualText, "Git - Установка Git");

    }

}
