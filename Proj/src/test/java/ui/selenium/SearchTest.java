package ui.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ui.pages.selenium.SearchPage;
import util.ConfProperties;
import static org.junit.Assert.assertEquals;

public class SearchTest {
    public static SearchPage searchPage;
    public static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        searchPage = new SearchPage(driver);
        driver.get(ConfProperties.getProperty("search"));
    }

    @Test
    public void AddAuthorTest() {//searchTest
        searchPage.inputSearch("Michael");
        String y = searchPage.getSearch();
        searchPage.clickToFindBtnBtn();
        assertEquals("Michael",y);
    }

    @After
    public void after() {
        System.clearProperty("End");
        driver.close();;
    }
}