package ui.selenium;

import org.junit.After;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ui.pages.selenium.TwPage;
import util.ConfProperties;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class TwTest {
    public static TwPage twPage;
    public static WebDriver driver;

    @BeforeAll
    public void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        twPage = new TwPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("topicPage"));
    }

    @Test
    public void twTest() throws InterruptedException {
        twPage.clickBtnSocial();
        twPage.clickBtnTwitter();
        twPage.inputSearch("DuckDuckGo");
        String y = twPage.getSearch();
        twPage.clickBtnGo();
        assertEquals("DuckDuckGo",y);

    }

    @After
    public void after() {
        System.clearProperty("End");
        driver.close();;
    }
}
