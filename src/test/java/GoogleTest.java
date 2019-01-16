import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {
    @Test
    public void user_can_search_everything_in_google() {
        open("http://google.com/ncr");
        $(By.name("q")).val("selenide").pressEnter();

        System.out.println("Количество найденных ссылок:" + $$("#ires .g").size());        //.shouldHave(size(7));

        $("#ires .g").shouldHave(
                text("Selenide: concise UI tests in Java"));
    }
}
