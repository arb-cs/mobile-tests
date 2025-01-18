package screens;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.className;
import static io.appium.java_client.AppiumBy.id;

public class OnboardingScreens {
    private static final ElementsCollection pageIndexes = $(id("org.wikipedia.alpha:id/view_onboarding_page_indicator"))
        .$$(className("android.widget.LinearLayout"));
    private final SelenideElement skipButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_skip_button")),
        continueButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")),
        images = $(id("org.wikipedia.alpha:id/imageViewCentered")),
        addLangButton = $(id("org.wikipedia.alpha:id/addLanguageButton")),
        headlineTextOnScreens = $(id("org.wikipedia.alpha:id/primaryTextView")),
        mainTextOnScreens = $(id("org.wikipedia.alpha:id/secondaryTextView")),
        getStartedButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_done_button"));

    public static SelenideElement secondScreen = pageIndexes.get(1),
        thirdScreen = pageIndexes.get(2),
        fourthScreen = pageIndexes.get(3);

    @Step("Checking that on the onboarding screens the Skip and Continue buttons are visible.")
    public OnboardingScreens skipAndContineButtonsAreVisible() {
        skipButton.shouldBe(Condition.visible);
        continueButton.shouldBe(Condition.visible);

        return this;
    }

    @Step("Image of the screen is visible.")
    public OnboardingScreens imageIsVisible() {
        images.shouldBe(Condition.visible);

        return this;
    }

    @Step("Add language button is visible.")
    public OnboardingScreens addLanguageButtonIsVisible() {
        addLangButton.shouldBe(Condition.visible);
        return this;
    }

    @Step("Checking")
    public OnboardingScreens headlineOfTheScreenHasExpectedText(String text) {
        headlineTextOnScreens.shouldHave(Condition.text(text));

        return this;
    }

    public OnboardingScreens theMainTextOfTheScreenCompliesWithTheRequirements(String text) {
        mainTextOnScreens.shouldHave(Condition.text(text));

        return this;
    }

    public OnboardingScreens theGetStartedButtonIsVisible() {
        getStartedButton.shouldBe(Condition.visible);

        return this;
    }

    public OnboardingScreens tapToMoveToTheNextScreen(SelenideElement screen) {
        screen.click();

        return this;
    }
}
