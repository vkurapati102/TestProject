package TestAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleClass {

    public static void getWebsite() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
       // System.setProperty("webdriver.chrome.driver","C:\\Users\\vekurapa\\Desktop\\ChromeInstance\\chromedriver.exe");
        driver.get("https://www.google.co.uk/");
        Thread.sleep(5000);
        driver.close();
    }
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\vekurapa\\Desktop\\ChromeInstance\\chromedriver.exe");

        getWebsite();
    }
}
