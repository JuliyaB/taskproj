package ui.pages.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwPage {
    public WebDriver driver;

    public TwPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@data-type,'social')]")
    private WebElement btnSocial;
    @FindBy(xpath = "//*[contains(text(),'Twitter')]")
    private WebElement btnTwitter;
    @FindBy(xpath = "//*[contains(@aria-label, 'Поисковый запрос')]")
    private WebElement searchField;
    @FindBy(xpath = "//*[contains(@class,'css-1dbjc4n r-1j3t67a r-9qu9m4')]")
    private WebElement btnGo;

    public void clickBtnSocial() {
        btnSocial.click();
    }
    public void clickBtnTwitter() {
        btnTwitter.click();
    }
    public void inputSearch(String search) {
        searchField.sendKeys(search);
    }
    public String getSearch() {
        return searchField.getAttribute("value");
    }
    public void clickBtnGo() {
        btnGo.click();
    }
}
