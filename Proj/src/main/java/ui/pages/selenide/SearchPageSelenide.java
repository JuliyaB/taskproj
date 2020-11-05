package ui.pages.selenide;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchPageSelenide {

    public void inputSearch(String search) {
        $(By.id("text")).setValue(search).pressEnter();
    }

    public String getSearch() {
        return $(By.name("text")).getAttribute("value");
    }
}
