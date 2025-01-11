package tests.android;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.SearchResultsScreen;
import screens.SearchScreen;
import tests.TestBase;

import static com.codeborne.selenide.Selenide.back;

public class SearchTests extends TestBase {

    @Test
    @Tag("android")
    @DisplayName("Enter a query in the search box and check that there are search results.")
    void successfulSearchTest() {
        back();
        SearchScreen searchPage = new SearchScreen();

        searchPage.enterSearchQuery("Appium");
        searchPage.validateThatThereAreQueryResults();
    }

    @Test
    @Tag("android")
    @DisplayName("Do a search and try to open the first article.")
    void openAnArticle() {
        back();
        SearchScreen searchPage = new SearchScreen();
        SearchResultsScreen searchResultsScreen = new SearchResultsScreen();

        searchPage.enterSearchQuery("jUnit");
        searchPage.validateThatThereAreQueryResults();
        searchResultsScreen.openArticle();
    }
}
