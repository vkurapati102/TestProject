package TestAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class GMailPage {

    private static WebDriver driver;

    public GMailPage(WebDriver driver) {this.driver = driver;
    }

    public static WebDriver getChromeInstance(){
        driver = new ChromeDriver();
        return driver;
    }

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\vekurapa\\Desktop\\ChromeInstance\\chromedriver.exe");

        driver = getChromeInstance();
        driver.get("https://www.google.co.uk/");

       List<WebElement> linkElements = new ArrayList<WebElement>();
       linkElements = driver.findElements(By.xpath("//div[@class='gb_Xa gb_Ng gb_i gb_Mg gb_Qg gb_4f']"));
        System.out.println("No of Links in the selected xpath:"+ linkElements.size());
        System.out.println(linkElements.get(0));
    driver.close();


    }
}
