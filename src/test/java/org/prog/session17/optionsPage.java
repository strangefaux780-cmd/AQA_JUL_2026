package org.prog.session17;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.sql.SQLException;
import java.time.Duration;
import java.util.List;



public class optionsPage {
    private WebDriver driver;


    public optionsPage(WebDriver driver) {
        this.driver = driver;
    }

    @Given("Create new Google page")
    @BeforeSuite
    public void beforesuite() {
        driver = new ChromeDriver();
    }

    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }

    @Given("Load Google page Allo.ua")
    public void loadPage() {
        driver.get("https://allo.ua/");
    }

    public void maximWindow() {
        driver.manage().window().maximize();
    }

    @Given("Search phone to input field")
    public void findPhone(String Phones) {
        WebElement search = driver.findElement(By.id("search-form__input"));
        search.sendKeys(Phones);
        search.sendKeys(Keys.ENTER);
    }

    public List<String> getProductNames(int limit) {
        return driver.findElements(By.xpath("//a[@class='product-card__title']"))
                .stream()
                .limit(limit)
                .map(el -> el.getAttribute("textContent"))
                .toList();
    }
    public List<String> getProductCode(int limit) {
        return driver.findElements(By.xpath("//span[@class='product-sku__value']"))
                .stream()
                .limit(limit)
                .map(el -> el.getAttribute("textContent"))
                .toList();
    }
    public List<String> getProductPrice(int limit) {
        return driver.findElements(By.xpath("//div[@class='v-pb__cur discount']"))
                .stream()
                .limit(limit)
                .map(el -> el.getAttribute("textContent"))
                .toList();
    }


    public void publichPhone(int limit) throws SQLException {
        WebDriverWait waitpage = new WebDriverWait(driver, Duration.ofSeconds(40));
        WebElement productName = waitpage.until(
                ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='product-card__title']")));
        List<String> phoneNames = getProductNames(limit);
        List<String> phoneCodes =getProductCode(limit);
        List<String> phonePrices =getProductPrice(limit);
        dbPhoneTest db = new dbPhoneTest();
        db.connectDB();
        for (int i = 0; i < limit; i++) {
            String name=phoneNames.get(i);
            String code=phoneCodes.get(i);
            String price=phonePrices.get(i);
            db.phoneDB(name, code, price);
        }
    }

}