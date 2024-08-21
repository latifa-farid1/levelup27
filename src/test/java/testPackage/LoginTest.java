package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {
        @Test
        public void OpenBrowser() {
            WebDriver driver;
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://the-internet.herokuapp.com/");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//a[@href='/login']")).click();
            driver.findElement(By.id("username")).sendKeys("tomsmith");
            driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
            driver.findElement(By.className("radius")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.navigate().back();
            driver.navigate().back();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//a[@href='/tables']")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.navigate().back();
            driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//a[@href='/inputs']")).click();
            driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//input[@type='number']")).sendKeys("10");
            driver.navigate().back();
            driver.quit();


        }
    }
