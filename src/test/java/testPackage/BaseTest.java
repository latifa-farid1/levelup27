package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseTest {
    @Test
    public void  OpenBrowser(){
        WebDriver driver;
        driver= new ChromeDriver();

        driver.get("https://www.google.com/");
       String URLName= driver.getTitle();
        Assert.assertEquals(URLName,"Google");
        driver.quit();


    }
 @Test
    public void viewLog(){
     WebDriver driver;
     driver= new ChromeDriver();
     driver.get("https://www.google.com/");
     WebElement logo = driver.findElement(By.className("lnXdpd"));
         Assert.assertTrue(logo.isDisplayed());
         driver.quit();
 }
 public void search1(){
     WebDriver driver= new ChromeDriver();
     driver.get("https://www.google.com/");


 }

}
