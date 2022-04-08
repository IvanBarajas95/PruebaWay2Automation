package pages;

import com.nivelics.commons.methods.web.Method;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Alert extends Method {
    //@FindBy(xpath = "//fieldset[@class='fieldset']//input[@name='name']")
    //private WebElement Name;
    @FindBy(xpath = "//p[2]//input[1]")
    private WebElement Lastname;
    @FindBy(xpath = "//label[normalize-space()='Single']")
    private WebElement Single;
    @FindBy(xpath = "//label[normalize-space()='Reading']")
    private WebElement Reading;
    @FindBy(xpath = "//body/section[@id='wrapper']/div[1]/div[1]/div[1]/form[1]/fieldset[4]/select[1]")
    private WebElement Country;
    @FindBy(xpath = "//body/section[@id='wrapper']/div[1]/div[1]/div[1]/form[1]/fieldset[5]/div[1]/select[1]")
    private WebElement month;
    @FindBy(xpath = "//div[@class='container margin-top-20']//div[2]//select[1]")
    private WebElement day;
    @FindBy(xpath = "//div[3]//select[1]")
    private WebElement year;
    //@FindBy(xpath = "//input[@value='submit']")
    //private WebElement buttonsubmit;
    @FindBy(xpath = "//fieldset[@class='fieldset']//input[@name='phone']")
    private WebElement phone;
    @FindBy(xpath = "//fieldset[@class='fieldset']//input[@name='username']")
    private WebElement username;
    @FindBy(xpath = "//fieldset[@class='fieldset']//input[@name='email']")
    private WebElement email;
    @FindBy(xpath = "//body/section[@id='wrapper']/div[1]/div[1]/div[1]/form[1]/fieldset[9]/input[1]")
    private WebElement uploadPicture;
    @FindBy(xpath="//form[@id='register_form']//fieldset//textarea")
    private WebElement aboutYourself;
    @FindBy(xpath = "//fieldset[@class='fieldset']//input[@name='password']")
    private WebElement password;
    @FindBy(xpath = "//input[@name='c_password']")
    private WebElement confirmPassword;
    @FindBy(xpath = "//input[@value='submit']")
    private WebElement buttonsubmit;
    @FindBy(xpath = "//body/section[@id='wrapper']/div[1]/div[1]/div[1]/form[1]/fieldset[1]/p[1]/label[2]")
    private WebElement alertName;

    String profilepicture = "C:\\Users\\ivano\\OneDrive\\Escritorio\\female-profile-icon-10.jpg";


    Select country = null;
    Select mes = null;
    Select optionday = null;
    Select optionyear = null;

    public Alert Form() {
        //WAIT_INTERFACE.waitForElementToClickeable(10, 2, Name);
        //SEN_KEYS_INTERFACE.sendKeys(Name, "Ivan");
        WAIT_INTERFACE.waitForElementToClickeable(10, 2, Lastname);
        SEN_KEYS_INTERFACE.sendKeys(Lastname, "Barajas");
        WAIT_INTERFACE.waitForElementToClickeable(10, 2, Single);
        UTILS_INTERFACE.clickElement(Single);
        WAIT_INTERFACE.waitForElementToClickeable(10, 2, Reading);
        UTILS_INTERFACE.clickElement(Reading);
        //WAIT_INTERFACE.waitForElementToClickeable(10, 2, Country);
        //UTILS_INTERFACE.clickElement(Country);
        country = new Select(Country);
        country.selectByIndex(1);
        mes = new Select(month);
        mes.selectByIndex(1);
        optionday = new Select(day);
        optionday.selectByIndex(1);
        optionyear = new Select(year);
        optionyear.selectByIndex(1);
        //UTILS_INTERFACE.scrollIntoView(buttonsubmit);
        SEN_KEYS_INTERFACE.sendKeys(phone, "3005041221");
        SEN_KEYS_INTERFACE.sendKeys(username, "IvanBarajas95");
        SEN_KEYS_INTERFACE.sendKeys(email, "Ivanovalle_b@hotmail.com");
        WAIT_INTERFACE.waitForElementIsDisplayed(10, 2, uploadPicture);
        //UTILS_INTERFACE.clickElement(uploadPicture);
        SEN_KEYS_INTERFACE.sendKeys(uploadPicture, profilepicture);
        SEN_KEYS_INTERFACE.sendKeys(aboutYourself, "I am Quality Assuramce Tester, I am 26 years old");
        SEN_KEYS_INTERFACE.sendKeys(password, "1234");
        SEN_KEYS_INTERFACE.sendKeys(confirmPassword, "1234");
        UTILS_INTERFACE.clickElement(buttonsubmit);
        String namealert = alertName.getText();
        softAssert.assertEquals(namealert,"This field is required.");
        softAssert.assertAll();
        WAIT_INTERFACE.pause(10);

        return this;}
}
