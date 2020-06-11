package TestAutomation;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchDemo {

    public void getWebsite(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        WebElement inputTextBox = driver.findElement(By.id("searchInput"));
        boolean idPresenter = inputTextBox.isDisplayed();
        System.out.println("*******"+ idPresenter);
        inputTextBox.sendKeys("Corona Virus");
        WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button"));
        searchBox.click();
        String expdBrowserTitle = "Coronavirus - Wikipedia";
        String obBroserTitle = driver.getTitle();
        Assert.assertEquals(expdBrowserTitle,obBroserTitle);
    }

    public static void main(String[] args) {
        SearchDemo sd = new SearchDemo();
        sd.getWebsite();
    }

}
