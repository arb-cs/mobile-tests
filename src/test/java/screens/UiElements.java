package screens;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;

public class UiElements {
    private final SelenideElement textButton = $(accessibilityId("Text Button")),
        textInput = $(accessibilityId("Text Input")),
        textOutput = $(accessibilityId("Text Output"));

    @Step("Enter a text to the text input.")
    public UiElements enterATextToTheTextInput(String text) {
        textButton.click();
        textInput.sendKeys(text + "\n");

        return this;
    }

    @Step("Validate that in the screen the exact text is displayed.")
    public UiElements checkThatThePreviuoslyEnteredTextIsDisplayed(String text) {
        textOutput.shouldHave(Condition.text(text));

        return this;
    }
}
