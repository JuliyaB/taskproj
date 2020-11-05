package ui.selenide;

import com.codeborne.selenide.Configuration;
import org.junit.Test;
import ui.pages.selenide.Practice1PageSelenide;
import util.ConfProperties;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.*;

public class Practice1TestSelenide {

    @Test
    public void practice1Test(){
        Configuration.startMaximized=true;
        Practice1PageSelenide practice1PageSelenide = open(ConfProperties.getProperty("search"), Practice1PageSelenide.class);
        practice1PageSelenide.clickBtnMarket();

        switchTo().window(1);

        practice1PageSelenide.clickBtnCatalog();
        practice1PageSelenide.clickBtnSmartphones();

        practice1PageSelenide.clickBtnAllFilters();
        practice1PageSelenide.inputPriceTo("20000");

        practice1PageSelenide.clickBtnScreenDiagonal();
        practice1PageSelenide.inputInchesFrom("3");

        practice1PageSelenide.clickBtnManufacturers();
        practice1PageSelenide.clickBtnApple();
        practice1PageSelenide.clickBtnHonor();
        practice1PageSelenide.clickBtnHuawei();
        practice1PageSelenide.clickBtnOppo();
        practice1PageSelenide.clickBtnSamsung();
        practice1PageSelenide.clickBtnXiaomi();
        practice1PageSelenide.clickBtnShow();

        assertTrue(10<=practice1PageSelenide.quantityAmountOfElements().size());
        String x=practice1PageSelenide.firstElementL();
        practice1PageSelenide.clickBtnByNovelty();
        practice1PageSelenide.clickBtnShowMore();
        practice1PageSelenide.clickBtnPhone(x);

        switchTo().window(2);

        System.out.println(practice1PageSelenide.evaluation());
    }
}
