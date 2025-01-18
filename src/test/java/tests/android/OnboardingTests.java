package tests.android;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.OnboardingScreens;
import tests.TestBase;

import static data.Texts.SECOND_PAGE_TEXT;
import static data.Texts.THIRD_PAGE_TEXT;
import static data.Texts.FOURTH_PAGE_TEXT;

@Tag("onboarding")
public class OnboardingTests extends TestBase {
    @Test
    @DisplayName("Checking onboarding screens")
    public void validateOnboardingScreens() {
        OnboardingScreens onboardingScreens = new OnboardingScreens();

        // The first screen
        onboardingScreens.skipAndContineButtonsAreVisible();
        onboardingScreens.imageIsVisible();
        onboardingScreens.addLanguageButtonIsVisible();
        onboardingScreens.headlineOfTheScreenHasExpectedText("The Free Encyclopedia …in over 300 languages");

        // The second screen
        onboardingScreens.tapToMoveToTheNextScreen();
        onboardingScreens.imageIsVisible();
        onboardingScreens.headlineOfTheScreenHasExpectedText("New ways to explore");
        onboardingScreens.theMainTextOfTheScreenCompliesWithTheRequirements(SECOND_PAGE_TEXT);

        // The third screen
        onboardingScreens.tapToMoveToTheNextScreen();
        onboardingScreens.imageIsVisible();
        onboardingScreens.headlineOfTheScreenHasExpectedText("Reading lists with sync");
        onboardingScreens.theMainTextOfTheScreenCompliesWithTheRequirements(THIRD_PAGE_TEXT);

        // The fourth screen
        onboardingScreens.tapToMoveToTheNextScreen();
        onboardingScreens.imageIsVisible();
        onboardingScreens.headlineOfTheScreenHasExpectedText("Data & Privacy");
        onboardingScreens.theMainTextOfTheScreenCompliesWithTheRequirements(FOURTH_PAGE_TEXT);
        onboardingScreens.theGetStartedButtonIsVisible();
    }
}
