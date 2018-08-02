import Pages.GazinPage;
import Pages.YandexMainPage;
import Pages.YandexSearchPage;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class findGazinAndFollowByYandexTest {
    @BeforeClass
    public void beforeClass() {
        Configuration.browser = "chrome";
    }

    @Test
    public void fistTest() {
        YandexMainPage yandexMainPage = open("http://yandex.ru", YandexMainPage.class);
        YandexSearchPage yandexSearchPage = yandexMainPage.searchQuery("Газинформсервис");
        yandexSearchPage.followLinkByText("gaz-is.ru");
        GazinPage gazinPage = new GazinPage();
        gazinPage.waitGazinPage();
    }
}
