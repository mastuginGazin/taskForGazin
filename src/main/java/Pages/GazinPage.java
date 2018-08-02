package Pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;

public class GazinPage {
    public void waitGazinPage() {
        $(byClassName("about__wrapper")).shouldBe(Condition.exist);
    }
}
