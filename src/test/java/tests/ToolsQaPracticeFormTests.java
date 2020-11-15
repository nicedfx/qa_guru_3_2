package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.commands.Click;
import com.codeborne.selenide.conditions.Visible;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ToolsQaPracticeFormTests {

    @BeforeAll
    static  void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void regForm() {
        String firstName = "Privet",
                lastName = "Kakdela",
                userEmail = "privetkakdela@yahoo.com",
                userGender = "Other",
                userNumber = "+79211234578",
                dateOfBirthMonth = "February",
                dateOfBirthYear = "1950",
                dateOfBirthDay = "19";

        open("https://demoqa.com/automation-practice-form");

        $("#firstName").val(firstName);
        $("#lastName").val(lastName);
        $("#userEmail").val(userEmail);
        $("#genterWrapper").$(byText("Other")).click();
        $("#userNumber").val(userNumber);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(dateOfBirthMonth);
        $(".react-datepicker__year-select").selectOption(dateOfBirthYear);
        $(".react-datepicker__month").$(byText(dateOfBirthDay)).click();
//        $(".react-datepicker__day--0" +dateOfBirthDay).click();
        $("#subjectsContainer").click();
//        $("#subjectsContainer").selectOption("Math");

        System.out.println("aaaa");


    }
}
