import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class Smp_frontend {
    @Test
    public void test_frontend() {

        open("http://167.99.134.79/smp_frontend/login.html");
        $(byName("username")).setValue("Igor").pressEnter();
        $(byName("password")).setValue("helloworld").pressEnter();
        $(byLinkText("Локальная среда")).click();
        $(byLinkText("Облачная среда")).click();

        //        $(".select2-environment-container").selectOption("Облачная среда");
        $(byLinkText("Вход")).click();
    }
}
