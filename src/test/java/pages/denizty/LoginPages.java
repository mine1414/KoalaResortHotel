package pages.denizty;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPages{

    public LoginPages(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

  //  @FindBy (linkText = "Log in")
   // public WebElement LoginLinkText;

    @FindBy(xpath ="//*[@id=\"navLogon\"]/a")
    public WebElement logInButonu;

    @FindBy (id = "UserName")
    public WebElement UserNameText;

    @FindBy (id = "Password")
    public WebElement PasswordText;

    @FindBy (id = "btnSubmit")
    public WebElement btnSubmitButton;

    @FindBy (xpath = "/html/body/div[1]/div/div[2]/ul/li/a/span")
    public WebElement loggedInUser;


    //*[@id="divMessageResult"]/div/ul/li
    //@FindBy (xpath = "//*[@id='divMessageResult']/div/ul/li/text()")


    @FindBy(xpath = "//span[text()='Try again please']")
    public WebElement girisYapilamadi;
    // @FindBy(xpath = "//li[text()='Username or p
    // Password is incorrect, please correct them and try again']")
    @FindBy(xpath = "//li[contains(text(),'Username or password is incorrect')]")
    public WebElement mesajYazisi;

    @FindBy   (id= "divMessageResult")
    public WebElement negativeLoginMessage;

    //@FindBy   (id= "divMessageResult")
    //@FindBy   (className="validation-summary-errors")



}
