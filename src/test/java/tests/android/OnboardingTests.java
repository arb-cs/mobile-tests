package tests.android;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.OnboardingScreens;
import tests.TestBase;

@Tag("onboarding")
public class OnboardingTests extends TestBase {

    OnboardingScreens onboardingScreens = new OnboardingScreens();

    @Test
    @DisplayName("Visibility of the buttons.")
    void onboardingButtonsAreVisible() {
        onboardingScreens.skipAndContineButtonsAreVisible();
    }

    @Test
    @DisplayName("The first onboarding page.")
    void checkTheFirstPage() {
        onboardingScreens.validateTheFirstOnboardingScreen();
    }

    @Test
    @DisplayName("The second onboarding page.")
    void checkTheSecondPage() {
        onboardingScreens.validateTheSecondOnboardingScreen();
    }

    @Test
    @DisplayName("The third onboarding page.")
    void checkTheThirdPage() {
        onboardingScreens.validateTheThirdOnboardingScreen();
    }

    @Test
    @DisplayName("The fourth onboarding page.")
    void checkTheFourthPage() {
        onboardingScreens.validateTheFourthOnboardingScreen();
    }
}
