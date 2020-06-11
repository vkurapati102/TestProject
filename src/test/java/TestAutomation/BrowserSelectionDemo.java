package TestAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSelectionDemo {
    WebDriver driver = null;

    public WebDriver getChromeDriverInstance(){

        driver = new ChromeDriver();
        return driver;
    }
    public WebDriver getFirefoxDriverInstance(){
        driver = new FirefoxDriver();
        return driver;
     }
    public void getWebsite(String browser){
        if(browser.equalsIgnoreCase("Chrome")) {
            driver = getChromeDriverInstance();
        }
        else{
            driver = getFirefoxDriverInstance();
        }
    driver.get("https://www.wikipedia.org");
        }

    public static void main(String[] args) {
        BrowserSelectionDemo bs = new BrowserSelectionDemo();
        bs.getWebsite("Firefox");
    }
}

