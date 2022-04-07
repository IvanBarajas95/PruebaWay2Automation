package pages;

import com.nivelics.commons.methods.web.Method;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PruebaWayAutomation extends Method {
    @FindBy(xpath="//fieldset[@class='fieldset']//input[@name='name']")
    private WebElement Name;
    @FindBy(xpath="//p[2]//input[1]")
    private WebElement Lastname;
    @FindBy(xpath="//label[normalize-space()='Single']")
    private WebElement Single;
    @FindBy(xpath="//label[normalize-space()='Reading']")
    private WebElement Reading;
    @FindBy(xpath="//body/section[@id='wrapper']/div[1]/div[1]/div[1]/form[1]/fieldset[4]/select[1]")
    private WebElement Country;
    @FindBy(xpath="//body/section[@id='wrapper']/div[1]/div[1]/div[1]/form[1]/fieldset[5]/div[1]/select[1]")
    private WebElement month;

    Select country =null;
    Select mes = null;

    public void Form(){
        WAIT_INTERFACE.waitForElementToClickeable(10,2,Name);
        SEN_KEYS_INTERFACE.sendKeys(Name,"Ivan");
        WAIT_INTERFACE.waitForElementToClickeable(10,2,Lastname);
        SEN_KEYS_INTERFACE.sendKeys(Lastname,"Barajas");
        WAIT_INTERFACE.waitForElementToClickeable(10,2,Single);
        UTILS_INTERFACE.clickElement(Single);
        WAIT_INTERFACE.waitForElementToClickeable(10,2,Reading);
        UTILS_INTERFACE.clickElement(Reading);
        WAIT_INTERFACE.waitForElementToClickeable(10,2,Country);
        //UTILS_INTERFACE.clickElement(Country);
        country = new Select(Country);
        country.selectByIndex(1);
        mes = new Select(month);
        mes.selectByIndex(1);
        WAIT_INTERFACE.pause(10);




    }
}




//