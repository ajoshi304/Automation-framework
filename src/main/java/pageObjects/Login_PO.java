package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Global_Vars;

public class Login_PO extends Base_PO{
    private @FindBy(id ="text" )
    WebElement username_Textfield;

    private @FindBy(id ="password" )
    WebElement password_Textfield;

    private @FindBy(id ="login-button" )
    WebElement login_Button;

    public Login_PO (){
        super();
    }

    public void navigateTo_WebdriverUniversity_Login_Page(){
        navigateTo_URL(Global_Vars.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL+ "/Login-Portal/index.html?");
    }

    public void setUsername(String username){
        sendKeys(username_Textfield,username);
    }

    public void setPassword(String password){
      sendKeys(password_Textfield,password);
    }

    public void clickOn_Login_Button(){
        waitForWebElementAndClick(login_Button);
    }

    public void validate_SuccessfulLogin_Message(){
        waitForAlert_And_ValidateText("validation succeeded");
    }

    public void validate_UnsuccessfulLogin_Message(){
        waitForAlert_And_ValidateText("validation failed");
    }
}
