package org.prog.session17;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.sql.SQLException;

    public class StepPhone {
        WebDriver driver;
        optionsPage optpage;
        dbPhoneTest db;

        @Before
        public void setup() throws SQLException {
            driver = new ChromeDriver();
            optpage = new optionsPage(driver);
            db = new dbPhoneTest();
            db.connectDB();
        }

        @Given("I load allo.ua page")
        public void loadPage() {
            optpage.maximWindow();
            optpage.loadPage();
        }

        @When("I search phone {string}")
        public void searchPhone(String phoneName) {
            optpage.findPhone(phoneName);
        }

        @Then("I check phone in DB")
        public void checkPhone() throws SQLException {
            optpage.publichPhone(3);
        }
    }

