package tests.mobile;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import drivers.BrowserstackMobileDriver;
import drivers.LocalMobileDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.AddPagePage;
import pages.MainscreenPage;
import pages.MenuPage;

import static com.codeborne.selenide.Selenide.*;
import static helpers.Attach.pageSource;
//import static helpers.Attach.pageSource;

public class TestBase {
    public static MainscreenPage mainscreenPage = new MainscreenPage();
    public static MenuPage menuPage = new MenuPage();
    public static AddPagePage addPagePage = new AddPagePage();
    public static String deviceHost = System.getProperty("deviceHost");

    @BeforeAll
    public static void setDriver() {

        switch (deviceHost) {
            case "mobile_emulator":
                Configuration.browser = LocalMobileDriver.class.getName();
                break;
            case "mobile_browserstack":
                Configuration.browser = BrowserstackMobileDriver.class.getName();
                break;
        }
        Configuration.browserSize = null;
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    void afterEach() {
        String deviceHost = System.getProperty("deviceHost");
        pageSource();
        closeWebDriver();
        if (deviceHost.equals("mobile_browserstack")) {
            Attach.addVideo(sessionId().toString());
        }
        closeWebDriver();
    }
}
