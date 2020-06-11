package TestAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {
    public void getWebsite(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.eenadu.net/");
        driver.close();
    }

    public void getWiki(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        driver.close();
    }
    public static void main(String[] args) {
        SeleniumDemo sd = new SeleniumDemo();
        sd.getWebsite();
        sd.getWiki();

    }

}
