package ui.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.pages.selenium.TopicPage;
import util.ConfProperties;

import static org.junit.Assert.assertEquals;

public class TopicTest {
    public static TopicPage topicPage;
    public static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        topicPage = new TopicPage(driver);
        driver.get(ConfProperties.getProperty("topicPage"));
    }

    public void waitEl(){
        WebElement  wait = (new WebDriverWait(driver, 10))
        .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Темы')]")));
    }

    @Test
    public void topicTest() {
        topicPage.clickBtnMenu();
        waitEl();
        topicPage.clickBtnTopics();
        topicPage.clickBtnBlack();
        String y = topicPage.getBtnLogOff();
        topicPage.clickBtnLogOff();
        assertEquals("https://duckduckgo.com/", y);
    }

    @After
    public void after() {
        System.clearProperty("End");
        driver.close();;
    }
}
