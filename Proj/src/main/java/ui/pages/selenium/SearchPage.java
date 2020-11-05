package ui.pages.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    public WebDriver driver;

    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "text")
    private WebElement searchField;
    @FindBy(xpath = "//*[contains(@class, 'button mini-suggest__button button_theme_websearch button_size_ws-head i-bem button_js_inited')]")
    private WebElement toFindBtn;
    @FindBy(xpath = "//input[@name='text']")
    private WebElement getSearchField;

    public void inputSearch(String search) {
        searchField.sendKeys(search);
    }
    public String getSearch() {
        return searchField.getAttribute("value");
    }
    public void clickToFindBtnBtn() {
        toFindBtn.click();
    }
}
