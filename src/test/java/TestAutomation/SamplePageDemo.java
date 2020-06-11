package TestAutomation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SamplePageDemo {

    private static WebDriver driver = null;

    public WebDriver getChromeDriverInstance(){
        driver = new ChromeDriver();
        return driver;
    }

    public void getWebsite() throws InterruptedException {
        driver = getChromeDriverInstance();
        driver.get("https://www.testandquiz.com/selenium/testing.html");
        Thread.sleep(2000);

        WebElement textBoxToEnter = driver.findElement(By.xpath("//*[@id=\"fname\"]"));
        textBoxToEnter.isDisplayed();
        textBoxToEnter.sendKeys("Ram");

        WebElement toSubmit = driver.findElement(By.id("idOfButton"));
        toSubmit.isDisplayed();
        toSubmit.click();

        WebElement radioButton = driver.findElement(By.id("male"));
        radioButton.isDisplayed();
        radioButton.click();

        WebElement checkBox = driver.findElement(By.className("Performance"));
        checkBox.isDisplayed();
        checkBox.click();

        Select dropDown = new Select (driver.findElement(By.id("testingDropdown")));
        dropDown.selectByVisibleText("Database Testing");
        Thread.sleep(5000);

        WebElement linkText = driver.findElement(By.linkText("This is a link"));
        linkText.isDisplayed();
        linkText.click();
        String expectedLink = driver.getCurrentUrl();
        String actualLink = "https://www.javatpoint.com/";
        Thread.sleep(3000);
        driver.close();

    }


    public static void main(String[] args) throws InterruptedException {
        SamplePageDemo spd = new SamplePageDemo();
        spd.getWebsite();
    }
}
