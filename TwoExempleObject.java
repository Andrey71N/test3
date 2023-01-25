import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import static java.sql.DriverManager.getDriver;


public class TwoExempleObject extends TwoExemple{

        @FindBy(id = ".//input[@id='user-name']")
        private WebElement login;

        @FindBy(id = ".//input[@id='password']")
        private WebElement password;


        public void loginIn(String login, String password){

            Actions loginIn = new Actions(getDriver());
            loginIn
                    .sendKeys(this.login,login)
                    .click(this.password)
                    .sendKeys(password)
                    .build()
                    .perform();
        }

    }
