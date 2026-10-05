package org.prog.session17;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.sql.SQLException;

public class PhonesTetsSQL {
    private WebDriver driver;
    private optionsPage optpage;
    @BeforeSuite
    public void optionsPage() {
        driver = new ChromeDriver();
        optpage =new optionsPage(driver);

    }
    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }

    @Test
    public void testFindElm() throws SQLException {
        optpage.maximWindow();
  optpage.loadPage();
        optpage.findPhone("Samsung S26 Ultra");
        optpage.publichPhone(3);






    }

}