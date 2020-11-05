package ui.selenide;

import org.junit.Test;
import ui.pages.selenide.TopicPageSelenide;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;

public class TopicTestSelenide {
    @Test
    public void topicTest(){
        TopicPageSelenide topicPageSelenide = open("https://duckduckgo.com/", TopicPageSelenide.class);
        topicPageSelenide.clickBtnMenu();
        topicPageSelenide.clickBtnTopics();
        topicPageSelenide.clickBtnBlack();
        String y = topicPageSelenide.getBtnLogOff();
        topicPageSelenide.clickBtnLogOff();
        assertEquals("https://duckduckgo.com/", y);
    }
}
