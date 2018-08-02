package Pages;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;

public class YandexMainPage {

    public YandexSearchPage searchQuery(String query) {
        $("#text").setValue(query);
        $(byAttribute("role", "search")).$(byCssSelector("button")).click();
        return new YandexSearchPage();
    }
}