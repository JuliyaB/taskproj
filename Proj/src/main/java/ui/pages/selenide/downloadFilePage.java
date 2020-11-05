package ui.pages.selenide;

import org.openqa.selenium.By;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$;

public class downloadFilePage {
    public void clickFile5MB() throws FileNotFoundException {
        $(By.xpath("//a[@href='/5MB.zip')]")).download();
    }

}
