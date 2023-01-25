import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FiveExemple {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");


        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com");

        // Поле Username" не заполнено

        WebElement webElement1 = driver.findElement(By.xpath(".//input[@id='user-name']"));
        WebElement webElement2 = driver.findElement(By.xpath(".//input[@id='password']"));
        WebElement webElement3 = driver.findElement(By.xpath(".//input[@id='login-button']"));




        webElement2.click();
        webElement2.sendKeys("secret_sauce");

        webElement3.click();


        List<WebElement> webElements = driver.findElements(By.name("error"));
        if(webElements.size()>1){
            //todo
        }

        driver.quit();


    }
}
