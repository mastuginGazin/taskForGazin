package Pages;

import java.util.Set;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class YandexSearchPage {
    public void followLinkByText(String linkText) {
        String currentHandle = getWebDriver().getWindowHandle();
        $(byClassName("serp-list")).$(withText(linkText)).click();

        Set<String> Handels = getWebDriver().getWindowHandles();
        for (String handle : Handels) {
            if (!handle.equalsIgnoreCase(currentHandle)) {
                getWebDriver().switchTo().window(handle);
            }
        }
    }
}
