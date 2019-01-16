import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class Smp_frontend {
    @Test
    public void test_frontend() {

        open("https://ru.wikipedia.org");
        $("#searchInput").setValue("Selenium").pressEnter();
        $("#firstHeading").shouldHave(exactText("Selenium"));
        System.out.println( $$(byXpath("//a[@href='#Ссылки'")).size() );




    }
}
