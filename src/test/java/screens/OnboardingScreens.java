package screens;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static data.Texts.*;
import static io.appium.java_client.AppiumBy.className;
import static io.appium.java_client.AppiumBy.id;

public class OnboardingScreens {
    private final ElementsCollection pageIndexes = $(id("org.wikipedia.alpha:id/view_onboarding_page_indicator"))
        .$$(className("android.widget.LinearLayout"));
    private final SelenideElement skipButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_skip_button")),
        continueButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")),
        images = $(id("org.wikipedia.alpha:id/imageViewCentered")),
        addLangButton = $(id("org.wikipedia.alpha:id/addLanguageButton")),
        headerTextOnScreens = $(id("org.wikipedia.alpha:id/primaryTextView")),
        mainTextOnScreens = $(id("org.wikipedia.alpha:id/secondaryTextView")),
        secondScreen = pageIndexes.get(1),
        thirdScreen = pageIndexes.get(2),
        fourthScreen = pageIndexes.get(3),
        getStartedButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_done_button"));


    @Step("Check that on the onboarding screens the Skip and Continue buttons are visible.")
    public OnboardingScreens skipAndContineButtonsAreVisible() {
        skipButton.shouldBe(Condition.visible);
        continueButton.shouldBe(Condition.visible);

        return this;
    }

    @Step("Check the first onboarding screen.")
    public OnboardingScreens validateTheFirstOnboardingScreen() {
        images.shouldBe(Condition.visible);
        addLangButton.shouldBe(Condition.visible);
        headerTextOnScreens.shouldHave(Condition.text("The Free Encyclopedia …in over 300 languages"));

        return this;
    }

    @Step("Check the second onboarding screen.")
    public OnboardingScreens validateTheSecondOnboardingScreen() {
        secondScreen.click();
        images.shouldBe(Condition.visible);
        headerTextOnScreens.shouldHave(Condition.text("New ways to explore"));
        mainTextOnScreens.shouldHave(Condition.text(SECOND_PAGE_TEXT));

        return this;
    }

    @Step("Check the third onboarding screen.")
    public OnboardingScreens validateTheThirdOnboardingScreen() {
        thirdScreen.click();
        images.shouldBe(Condition.visible);
        headerTextOnScreens.shouldHave(Condition.text("Reading lists with sync"));
        mainTextOnScreens.shouldHave(Condition.text(THIRD_PAGE_TEXT));

        return this;
    }

    @Step("Check the fourth onboarding screen.")
    public OnboardingScreens validateTheFourthOnboardingScreen() {
        fourthScreen.click();
        images.shouldBe(Condition.visible);
        headerTextOnScreens.shouldHave(Condition.text("Data & Privacy"));
        getStartedButton.shouldBe(Condition.visible);
        mainTextOnScreens.shouldHave(Condition.text(FOURTH_PAGE_TEXT));

        return this;
    }
}
