import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {

    @BeforeMethod
    public static void setup() {
        Configuration.baseUrl = "http://google.com";

    }

    @Test
    public void user_can_search_everything_in_google() {

        open("/");
        $(By.name("q")).val("selenide").pressEnter();

        System.out.println("Количество найденных ссылок:" + $$("#ires .g").size());        //.shouldHave(size(7));

        $("#ires .g").shouldHave(
                text("Selenide: concise UI tests in Java"));
    }
}
