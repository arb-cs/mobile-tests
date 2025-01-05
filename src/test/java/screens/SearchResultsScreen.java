package screens;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.className;
import static io.appium.java_client.AppiumBy.id;

public class SearchResultsScreen {
    public final ElementsCollection searchResults = $$(id("org.wikipedia.alpha:id/page_list_item_title"));
    private final ElementsCollection textView = $$(className("android.widget.TextView"));

    @Step("Try to open the first article.")
    public SearchResultsScreen openArticle() {
        searchResults.first().click();
        textView.first().shouldHave(Condition.text("An error occurred"));

        return this;
    }
}
