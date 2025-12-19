package logical;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Text {


    WebDriver driver;
    JavascriptExecutor je;

    public Text(WebDriver driver) {

        this.driver = driver;
        je = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ul[@class='menu-list']//span[text()='Text Box']")
    private WebElement textBox;

    @FindBy(id="userName")
    private WebElement fullName;

    @FindBy(id="userEmail")
    private WebElement userEmail;

    @FindBy(id="currentAddress")
    private WebElement userAddress;

    @FindBy(id="permanentAddress")
    private WebElement permAddress;

    @FindBy(id="submit")
    private WebElement submitButton;

    public void clickTextBox() {

        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(textBox));
        textBox.click();
    }

    public void enterFullName() {

        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5));
        WebElement name = wait.until(ExpectedConditions.elementToBeClickable(fullName));
        fullName.sendKeys("Ajay Singh Banoula");

    }

    public void enterUserEmail() {

        userEmail.sendKeys("aj08@gmail.com");

    }

    public void enterAddress() {

        userAddress.sendKeys("Lucknow, Uttar Pradesh");

    }

    public void setPermAddress() {
        permAddress.sendKeys("Lucknow");
    }

    public void clickSubmit() throws InterruptedException {

        je.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", submitButton);
        Thread.sleep(1500);
        submitButton.click();
    }

    public void scrollUp() {

        je.executeScript("window.scrollTo(0,0)");
    }


}



