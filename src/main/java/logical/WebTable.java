package logical;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class WebTable {
    private WebDriver driver;
    public WebTable (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

//Locators
    @FindBy(xpath = "//ul[@class='menu-list']//span[text()='Web Tables']")
    private WebElement webTableCard;

    @FindBy(id = "addNewRecordButton")
    private WebElement newRecord;

    @FindBy(id = "firstName")
    private WebElement firstName;

    @FindBy(id="lastName")
    private WebElement lastName;

    @FindBy(id="userEmail")
    private WebElement email;

    @FindBy(id="age")
    private WebElement age;

    @FindBy(id="salary")
    private WebElement salary;

    @FindBy(id="department")
    private WebElement dept;

    @FindBy(id="submit")
    private WebElement submitButton;

    //Page Actions
    public void webTable () {
        webTableCard.click();
    }
    public void setNewRecord() {
        newRecord.click();
    }
    public void setFirstName(String fname) {
        firstName.sendKeys(fname);
    }
    public void setLastName(String lname) {
        lastName.sendKeys(lname);
    }
    public void setUserEmail(String emailid) {
        email.sendKeys(emailid);
    }
    public void setAge(String userage) {
        age.sendKeys(userage);
    }
    public void setSalary(String usersalary) {
        salary.sendKeys(usersalary);
    }
    public void setDepartment(String dep) {
        dept.sendKeys(dep);
    }
    public void clickSubmit() {
        submitButton.click();
    }

}
