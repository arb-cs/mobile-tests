package tests.android;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.SearchResultsScreen;
import screens.SearchScreen;
import tests.TestBase;

@Tag("android")
public class SearchTests extends TestBase {

    @Test
    void successfulSearchTest() {
        SearchScreen searchPage = new SearchScreen();

        searchPage.enterSearchQuery("Appium");
        searchPage.validateThatThereAreQueryResults();
    }

    @Test
    void openAnArticle() {
        SearchScreen searchPage = new SearchScreen();
        SearchResultsScreen searchResultsScreen = new SearchResultsScreen();

        searchPage.enterSearchQuery("jUnit");
        searchPage.validateThatThereAreQueryResults();
        searchResultsScreen.openArticle();
    }
}
