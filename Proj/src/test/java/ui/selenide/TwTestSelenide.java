package ui.selenide;

import org.junit.Test;
import ui.pages.selenide.TwPageSelenide;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;

public class TwTestSelenide {

    @Test
    public void twTest(){
        TwPageSelenide twPageSelenide = open("ftp://speedtest.tele2.net/", TwPageSelenide.class);
        twPageSelenide.clickBtnSocial();
        twPageSelenide.clickBtnTwitter();
        twPageSelenide.inputSearch("DuckDuckGo");
        String y = twPageSelenide.getSearch();
        assertEquals("DuckDuckGo",y);
    }
}
