import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class OneExemple {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup(); // библиотека которую подгружает браузер авторатически
        ChromeOptions options = new ChromeOptions(); // запуск браузера с определёнными опциями "--incognito" и "start-maximized"
        options.addArguments("--incognito");
        //options.addArguments("--headless"); //запускается браузер, но физически он не открывается
        options.addArguments("start-maximized");


        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); //не явное ожидание которое срабатывает всегда, отклик сайта по времени
        driver.get("https://www.saucedemo.com");


//        WebElement webElement1 = driver.findElement(By.name("q"));
//        WebElement webElement2 = driver.findElement(By.cssSelector("input.gLFyf.gsfi"));
//        WebElement webElement3 = driver.findElement(By.xpath(".//input[@name='q']"));




        // введён валидный "Username"
        // введён валидный "Password"


        WebElement webElement1 = driver.findElement(By.xpath(".//input[@id='user-name']"));
        WebElement webElement2 = driver.findElement(By.xpath(".//input[@id='password']"));
        WebElement webElement3 = driver.findElement(By.xpath(".//input[@id='login-button']"));

        WebElement webElement4 = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));



        List<WebElement> webElements = driver.findElements(By.name("error"));
        if(webElements.size()>1){
            //todo
        }


        webElement1.click();
        webElement1.sendKeys("standard_user");
        webElement2.getText();

        webElement2.click();
        webElement2.sendKeys("secret_sauce");

        webElement3.click();

        webElement4.click();



//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }



        driver.quit();

    }
}