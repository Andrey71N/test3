import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.BooleanSupplier;

public class TestTest {
    public static BooleanSupplier main(int args) {

        WebDriverManager.chromedriver().setup(); // библиотека которую подгружает браузер авторатически
        ChromeOptions options = new ChromeOptions(); // запуск браузера с определёнными опциями "--incognito" и "start-maximized"
//        options.addArguments("--incognito");
        //options.addArguments("--headless"); //запускается браузер, но физически он не открывается
        options.addArguments("start-maximized");


        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); //не явное ожидание которое срабатывает всегда, отклик сайта по времени
        driver.get("https://spb.cian.ru/");


//        WebElement webElement1 = driver.findElement(By.name("q"));
//        WebElement webElement2 = driver.findElement(By.cssSelector("input.gLFyf.gsfi"));
//        WebElement webElement3 = driver.findElement(By.xpath(".//input[@name='q']"));




//        WebElement webElement1 = driver.findElement(By.name("q"));
//        WebElement webElement1 = driver.findElement(By.xpath(".//a[text()='Аренда']")); ////
//        WebElement webElement3 = driver.findElement(By.xpath(".//a[@class='_25d45facb5--link--rqF9a']")); ///
//        WebElement webElement4 = driver.findElement(By.xpath(".//a[@href='https://spb.cian.ru/snyat/']")); ///

//        WebElement webElement5 = driver.findElement(By.xpath(".//a[text()='Продажа']")); ///
//        WebElement webElement5 = driver.findElement(By.xpath(".//a[@class='_25d45facb5--link--rqF9a']")); не могу написать локатор, перебрасывает на class выше
//        WebElement webElement5 = driver.findElement(By.xpath(".//a[@href='https://spb.cian.ru/kupit/']")); ///


//        WebElement webElement5 = driver.findElement(By.xpath(".//a[text()='Новостройки']"));    ///
//        WebElement webElement5 = driver.findElement(By.xpath(".//a[@href='https://spb.cian.ru/kupit/']"));
//        WebElement webElement5 = driver.findElement(By.xpath("//a[@href='https://spb.cian.ru/novostrojki/']")); ///



//        WebElement webElement4 = driver.findElement(By.xpath("//a[text()='Дома и участки']"));  ///
//        WebElement webElement5 = driver.findElement(By.xpath("//div[@class='flag-link-container']"));
//        WebElement webElement6 = driver.findElement(By.xpath("//a[@href='https://spb.cian.ru/zagorod/?top_menu=suburban_landing']")); ///

//        WebElement webElement7 = driver.findElement(By.xpath("//a[text()='Коммерческая']"));   ///
//        WebElement webElement7 = driver.findElement(By.xpath("//a[@href='https://spb.cian.ru/commercial/']")); ///


//        WebElement webElement7 = driver.findElement(By.xpath("//a[text()='Ипотека']")); ///
//        WebElement webElement7 = driver.findElement(By.xpath("//a[@href='https://spb.cian.ru/ipoteka-main?banner=new-header-main']")); ///

//        WebElement webElement7 = driver.findElement(By.xpath("//span[@class='_25d45facb5--icon--IBQt2 _25d45facb5--icon-pik--b1At6']")); ///
//        WebElement webElement7 = driver.findElement(By.xpath("//a[@href='https://spb.cian.ru/ipoteka-main?banner=new-header-main']")); ///

//        WebElement webElement8 = driver.findElement(By.xpath("//span[contains(text(),'+ Разместить объявление')]")); ///
//        WebElement webElement8 = driver.findElement(By.xpath("//span[(text()='+ Разместить объявление')]")); ///
//        WebElement webElement8 = driver.findElement(By.xpath("//span[@class='_25d45facb5--text--rH6sj']")); ///



        List<WebElement> webElements = driver.findElements(By.name("error"));
        if(webElements.size()>1){
            //todo
        }


//        webElement1.click();
//        webElement1.sendKeys("standard_user");
//        webElement2.getText();
//
//        webElement2.click();
//        webElement2.sendKeys("secret_sauce");
//
//        webElement3.click();

//        webElement4.click();
//        webElement5.click();
//        webElement6.click();
//        webElement7.click();
//        webElement8.click();


//
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }



//        driver.quit();

        return null;
    }
}
