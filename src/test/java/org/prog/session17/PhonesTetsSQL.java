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
        String Name = optpage.phoneNames("//a[@class='product-card__title'][1]");
        String Code = optpage.phoneCod("//span[@class='product-sku__value'][1]");
        String Price = optpage.phonePrice("(//div[@class='v-pb__cur discount'])[1]");
        System.out.println("===========================================================");
        optpage.loadPage();
        optpage.findPhone("Iphone 18 pro");
        String Name1 =optpage.phoneNames("(//a[@class='product-card__title'])[1]");
        String Code1 = optpage.phoneCod("(//span[@class='product-sku__value'])[1]");
        String Price1=optpage.phonePrice("(//div[@class='v-pb__cur'])[1]");
        System.out.println("===========================================================");
       optpage.loadPage();
        optpage.findPhone("Xiomi 17 pro");
        String Name2 =optpage.phoneNames("(//a[@class='product-card__title'])[1]");
        String Code2 = optpage.phoneCod("(//span[@class='product-sku__value'])[1]");
        String Price2=optpage.phonePrice("(//span[@class='sum'])[1]");
        dbPhoneTest db = new dbPhoneTest();
        db.connectDB();
       db.phoneDB(Name, Code, Price);
        db.phoneDB(Name1,Code1,Price1);
        db.phoneDB(Name2,Code2,Price2);


    }
}