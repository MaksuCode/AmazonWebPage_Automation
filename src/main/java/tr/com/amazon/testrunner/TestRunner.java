package tr.com.amazon.testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tr.com.amazon.model.DriverManager;
import tr.com.amazon.model.DriverManagerFactory;
import tr.com.amazon.model.DriverType;
import tr.com.amazon.pages.HomePage;
import tr.com.amazon.user.User;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/"},
        glue = "cucumber.stepdefinitions",
        plugin = {"html:target/cucumber-html-report"},
        tags = "@Add_Product_To_Basket",
        stepNotifications = true,
        publish = true)

public class TestRunner {

    private static DriverManager driverManager ;
    public static WebDriver driver ;

    @BeforeClass
    public static void setUp(){
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
//        driver.manage().window().maximize();
    }


    @After
    public void shutDown(){
//        driverManager.quitDriver();
    }

//    @Test
//    public void test()  {
//        driver.get("https://www.amazon.com.tr");
//        HomePage homePage = new HomePage();
//        User user = new User();
//
//        WebElement searchTextBox = homePage.getSearchTextBox();
//        user.clicks(searchTextBox);
//        user.types("Bilgisayar" , searchTextBox);
//        user.hitsKey(Keys.ENTER , searchTextBox);
//
//
//
//
//
//    }





}