package tests.ios;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.UiElements;
import tests.TestBase;

public class IosTests extends TestBase {

    @Test
    @Tag("ios")
    void checkThatTypedTextIsDisplayed() {
        UiElements uiElements = new UiElements();
        uiElements.enterATextToTheTextInput("Hello world!");
    }
}
