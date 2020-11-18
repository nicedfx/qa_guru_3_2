package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AlfaBankTests {

    @BeforeAll
    public static void openUrl(){
        open("https://alfabank.ru");
    }

    @Test
    public void alfaTestDeposits() {
//      Navigate to the sought for page.

        $("#alfa").$(byText("Вклады")).click();
//        System.out.println($("#filter").$$(byText("Депозиты")).find(visible).parent());
        $("#filter").$$(byText("Депозиты")).find(visible).parent().click();
//        $(byText("Депозиты")).closest("a").click();

        $("#more-buttons").$(byText("Архивные счета и депозиты")).click();
        $("#filter").$(byText("Депозиты")).click();

//      Check that the page contains only 5 archive deposits.

//        $("#alfa-account").parent().$$x("./div").shouldHaveSize(5); - Why this approach is worse than the following?
        $("#alfa-account").parent().$$("[data-widget-name=CatalogCard").shouldHaveSize(5);

    }

    @Test

    public void alfaTest(){

        $("#alfa").$(byText("Вклады")).click();
//        $("[data-test-id=tabs-list]").lastChild();
        System.out.println($($("[data-test-id=tabs-list]").lastChild()));


    }

}
