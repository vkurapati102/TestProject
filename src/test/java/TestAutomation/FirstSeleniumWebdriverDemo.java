package TestAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumWebdriverDemo {

    WebDriver driver = null;

    public WebDriver getFirefoxDriverInstance(){
    System.setProperty("WebDriver.gecko.driver","C:\\geckodriver.exe");
    driver = new FirefoxDriver();
    return driver;
    }
            public void getWebsite(){
            driver = getFirefoxDriverInstance();
            //WebDriver driver = new ChromeDriver();
            driver.get("https://www.wikipedia.org/");
        }

        public static void main(String[] args) {
            FirstSeleniumWebdriverDemo classObj = new FirstSeleniumWebdriverDemo();
            classObj.getWebsite();
        }

}
