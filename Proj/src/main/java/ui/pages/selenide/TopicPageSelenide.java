package ui.pages.selenide;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TopicPageSelenide {

    public void clickBtnMenu() {
        $(By.xpath("//*[contains(text(),'⇶')]")).click();
    }
    public void clickBtnTopics() {
        $(By.xpath("//*[contains(text(),'Темы')]")).click();
    }
    public void clickBtnBlack() {
        $(By.xpath("//*[contains(text(),'Тёмная')]")).click();
    }
    public void clickBtnLogOff() {
        $(By.xpath("//*[contains(text(),'Сохранить и Выйти')]")).click();
    }
    public String getBtnLogOff() {
        return $(By.xpath("//*[contains(text(),'Сохранить и Выйти')]")).getAttribute("href");
    }
}
