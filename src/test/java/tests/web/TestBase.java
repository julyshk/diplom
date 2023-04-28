package tests.web;

import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.HomepagePage;
import pages.SearchCarPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static config.WebDriverProvider.setConfig;

public class TestBase {
    public static HomepagePage homepagePage = new HomepagePage();
    SearchCarPage searchCarPage = new SearchCarPage();

    @BeforeAll
    static void beforeAll() {
        setConfig();
        homepagePage.openPage();
        homepagePage.homeRegionChange();
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        homepagePage.openPage();
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        closeWebDriver();
    }
}