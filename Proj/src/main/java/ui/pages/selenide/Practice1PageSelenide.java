package ui.pages.selenide;

import com.codeborne.selenide.Selectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class Practice1PageSelenide {
    public void clickBtnMarket() {
        $(By.xpath("//*[contains(text(),'Маркет')]")).click();
    }
    public void clickBtnCatalog() {
        $(By.xpath("//*[contains(text(),'Каталог')]")).click();
    }
    public void clickBtnSmartphones() {
        $(By.xpath("//*[contains(text(),'Мобильные телефоны')]")).scrollTo().click();
    }
    public void clickBtnAllFilters() {
        $(By.xpath("//*[contains(text(),'Все фильтры')]")).click();
    }
    public void inputPriceTo(String priceTo) {
        $(By.xpath("//*[@placeholder= '416 400']")).setValue(priceTo);
    }
    public void clickBtnScreenDiagonal() {
        $(By.xpath("//*[contains(text(),'Диагональ экрана (точно)')]")).scrollTo().click();
    }
    public void inputInchesFrom(String inchesFrom) {
        $(By.xpath("//*[@placeholder= '1']")).setValue(inchesFrom);
    }
    public void clickBtnManufacturers() {
        $(By.xpath("//*[@data-tid= 'e1c9fd84']")).click();
    }
    public void clickBtnApple() {
        $(By.xpath("//*[@id= '153043']")).click();
    }
    public void clickBtnHonor() {
        $(By.id("15292504")).click();
    }
    public void clickBtnHuawei() {
        $(By.id("459710")).click();
    }
    public void clickBtnOppo() {
        $(By.id("6278641")).click();
    }
    public void clickBtnSamsung() {
        $(By.id("153061")).click();
    }
    public void clickBtnXiaomi() {
        $(By.id("7701962")).click();
    }
    public void clickBtnShow() {
        $(By.xpath("//*[contains(text(),'Показать')]")).click();
    }
    public List<WebElement> quantityAmountOfElements() {
        return $(By.xpath("//*[@class='_2Qo3ODl0by cia-vs']")).findElements(By.tagName("article"));
    }
    public String firstElementL() {
        return $(By.xpath("//*[@class='_3dCGE8Y9v3 cLo1fZHm2y']")).text();
    }
    public void clickBtnByNovelty() {
        $(By.xpath("//*[contains(text(),'по новизне')]")).click();
    }
    public void clickBtnPhone(String phone) {
        $(Selectors.byText(phone)).scrollTo().click();
    }
    public void clickBtnShowMore() {
        $(By.xpath("//*[contains(text(),'Показать ещё')]")).scrollTo().click();
    }
    public String evaluation() {
        return $(By.xpath("//*[@class= '_3nFvoU2Uov']")).text();
    }
}
