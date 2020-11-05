package ui.selenide;

import org.junit.Assert;
import org.junit.Test;
import ui.pages.selenide.SearchPageSelenide;
import util.ConfProperties;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertEquals;

public class SearchTestSelenide {
    @Test
    public void searchTest(){
        SearchPageSelenide searchPageSelenide = open("https://yandex.ru/", SearchPageSelenide.class);
        searchPageSelenide.inputSearch("Michael");
        String y=searchPageSelenide.getSearch();
        assertEquals("Michael",y);
    }
}
