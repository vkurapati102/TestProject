package TestAutomation;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class ActiveLinksAvailable {

   @Test
    public void test(){
       System.setProperty("webdriver.chrome.driver","C:\\Users\\vekurapa\\Desktop\\ChromeInstance\\chromedriver.exe");
           //WebDriver driver = new FirefoxDriver();
            WebDriver driver = new ChromeDriver();
           String url = "https://ebay.co.uk";
           driver.get(url);
           List<WebElement> linksAvailable = new ArrayList<WebElement>();
           linksAvailable = driver.findElements(By.tagName("a"));
           System.out.println("No of Links available:"+ linksAvailable.size());
        /*for(WebElement workingLinks:linksAvailable){
           String link = workingLinks.getText();
            System.out.println(link);
        }*/
           for(int i=0;i<linksAvailable.size(); i++){
               System.out.println(linksAvailable.get(i).getText() );
           }
          driver.close();
//           driver.quit();
   }


}
