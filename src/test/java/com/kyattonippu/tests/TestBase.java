package com.kyattonippu.tests;

import com.codeborne.selenide.Configuration;
import com.kyattonippu.pages.RegistrationPage;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = System.getProperty("browserSize","1440x900");
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.pageLoadStrategy = "eager";
    }
}
