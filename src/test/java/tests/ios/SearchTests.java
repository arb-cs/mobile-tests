package tests.ios;

import org.junit.jupiter.api.Test;
import screens.UiElements;
import tests.TestBase;

public class SearchTests extends TestBase {

    @Test
    void checkThatTypedTextIsDisplayed() {
        UiElements uiElements = new UiElements();
        uiElements.enterATextToTheTextInput("Hello world!");
    }
}
