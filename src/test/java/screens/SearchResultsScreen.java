package screens;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.className;
import static io.appium.java_client.AppiumBy.id;

public class SearchResultsScreen {
    public final ElementsCollection searchResults = $$(id("org.wikipedia.alpha:id/page_list_item_title"));
    private final SelenideElement screenWebView = $(className("android.webkit.WebView"));

    @Step("Try to open the first article.")
    public SearchResultsScreen openArticle() {
        searchResults.first().click();

        return this;
    }

    @Step("Check that the article has expected title.")
    public SearchResultsScreen checkThatTheTitleHasExpectedText(String title) {
        screenWebView.shouldHave(Condition.text(title));

        return this;
    }

}
