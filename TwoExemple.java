import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TwoExemple {
    public static void main(String[] args) {


    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--incognito");
    //options.addArguments("--headless");
    options.addArguments("start-maximized");


    WebDriver driver = new ChromeDriver(options);
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    driver.get("https://www.saucedemo.com");



    // не заполнено поле "Password"




    WebElement webElement1 = driver.findElement(By.xpath(".//input[@id='user-name']"));
    WebElement webElement2 = driver.findElement(By.xpath(".//input[@id='login-button']"));


    List<WebElement> webElements = driver.findElements(By.name("error"));
    if(webElements.size()>1){
        //todo
    }


    webElement1.click();
    webElement1.sendKeys("standard_user");

    webElement2.click();



//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    driver.quit();

}
}
