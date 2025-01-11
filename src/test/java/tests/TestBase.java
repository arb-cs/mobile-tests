package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import drivers.BrowserstackDriver;
import drivers.LocalDriver;
import helpers.AttachmentsHelper;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;
import static helpers.EnvironmentHelper.isBrowserstack;
import static helpers.EnvironmentHelper.isEmulation;

public class TestBase {
    @BeforeAll
    public static void setUp() {

        if (isBrowserstack) {
            Configuration.browser = BrowserstackDriver.class.getName();
        } else if (isEmulation) {
            Configuration.browser = LocalDriver.class.getName();
        } else {
            throw new RuntimeException("Unknown deviceHost was provided.");
        }

        Configuration.browserSize = null;
    }

    @BeforeEach
    public void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    public void afterEach() {
        String sessionId = Selenide.sessionId().toString();

        AttachmentsHelper.pageSource();
        Selenide.closeWebDriver();

        // Video is attached only when tests performed on browserstack.
        if (isBrowserstack) {
            AttachmentsHelper.addVideo(sessionId);
        }
    }
}