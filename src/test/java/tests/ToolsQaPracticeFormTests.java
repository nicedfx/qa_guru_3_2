package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.commands.Click;
import com.codeborne.selenide.conditions.Visible;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

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
                userGender = "Female",
                userNumber = "0987654321",
                dateOfBirthMonth = "February",
                dateOfBirthYear = "1950",
                dateOfBirthDay = "19",
                address = "City, street, building, floor, 999";
        File file = new File("src/test/resources/pic.jpg");

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
        $("#subjectsInput").val("m");
        $(".subjects-auto-complete__menu-list").$(byText("Chemistry")).click();
        $("#subjectsInput").val("e");
        $(".subjects-auto-complete__menu-list").$(byText("English")).click();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#uploadPicture").uploadFile(file);
        $("#currentAddress").val(address);
        $("#stateCity-wrapper").$("#state").click();
        $("#stateCity-wrapper").$("#state").$(byText("Uttar Pradesh")).click();
        $("#stateCity-wrapper").$("#city").click();
        $("#stateCity-wrapper").$("#city").$(byText("Lucknow")).click();
        $("#submit").click();

//        Checking that the result form contains all values that were filled.
        $("#example-modal-sizes-title-lg").exists();
        $

        System.out.println("aaaa");


    }
}
