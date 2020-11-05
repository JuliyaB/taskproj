package ui.pages.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopicPage {
    public WebDriver driver;

    public TopicPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(text(),'⇶')]")
    private WebElement btnMenu;
    @FindBy(xpath = "//*[contains(text(),'Темы')]")
    private WebElement btnTopics;
    @FindBy(xpath = "//*[contains(text(),'Тёмная')]")
    private WebElement btnBlack;
    @FindBy(xpath = "//*[contains(text(),'Сохранить и Выйти')]")
    private WebElement btnLogOff;

    public void clickBtnMenu() {
        btnMenu.click();
    }
    public void clickBtnTopics() {
        btnTopics.click();
    }
    public void clickBtnBlack() {
        btnBlack.click();
    }
    public void clickBtnLogOff() {
        btnLogOff.click();
    }
    public String getBtnLogOff() {
        return btnLogOff.getAttribute("href");
    }

}
