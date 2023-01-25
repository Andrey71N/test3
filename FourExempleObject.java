import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static java.sql.DriverManager.getDriver;

public class FourExempleObject extends FourExample{

        @FindBy(id = "#login-button")
        private WebElement password;


        public void loginIn(String login, String password){

            Actions loginIn = new Actions(getDriver());
            loginIn
                    .sendKeys(this.password,login)
                    .click(this.password)
                    .sendKeys(password)
                    .build()
                    .perform();
        }
}
