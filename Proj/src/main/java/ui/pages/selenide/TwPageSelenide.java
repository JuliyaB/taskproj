package ui.pages.selenide;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TwPageSelenide {

    public void clickBtnSocial() {
        $(By.xpath("//*[contains(@data-type,'social')]")).click();
    }
    public void clickBtnTwitter() {
        $(By.xpath("//*[contains(text(),'Twitter')]")).click();
    }
    public void inputSearch(String search) {
        $(By.xpath("//*[contains(@class, 'r-30o5oe r-1niwhzg r-17gur6a r-1yadl64 r-deolkf r-homxoj r-poiln3 r-7cikom r-1ny4l3l r-1sp51qo r-1lrr6ok r-1dz5y72 r-fdjqy7 r-13qz1uu')]")).setValue(search).pressEnter();
    }
    public String getSearch() {
        return $(By.xpath("//*[contains(@aria-label, 'Поисковый запрос')]")).getAttribute("value");
    }
}
