package tests.ios;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.UiElements;
import tests.TestBase;

@Tag("ios")
public class IosTests extends TestBase {

    @Test
    void checkThatTypedTextIsDisplayed() {
        UiElements uiElements = new UiElements();
        uiElements.enterATextToTheTextInput("Hello world!");
    }
}
