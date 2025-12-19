package logical;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBox {

    WebDriver driver;
    JavascriptExecutor je;

    public CheckBox(WebDriver driver) {

        this.driver = driver;
        je = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//ul[@class='menu-list']//span[text()='Check Box']")
     WebElement checkbox;

    @FindBy(xpath = "//button[@aria-label='Expand all']")
     WebElement expandButton;

    @FindBy(xpath = "//label[@for='tree-node-desktop']")
     WebElement desktopCheckbox;

    @FindBy (xpath = " //button[@aria-label='Collapse all']")
     WebElement collapseButton;

    @FindBy(xpath = "//div[@id='result']")
     WebElement message;

    public void clickCheckBox() {
        checkbox.click();
    }

    public void expand(){
        expandButton.click();
    }

    public void selectDesktop() {
        desktopCheckbox.click();

    }

    public void getMessage() {

        String msg = message.getText().replaceAll("\\s+", " ");
        System.out.print( "The message after clicking checkbox --> " +  msg);
    }

    public void collapse() {
        collapseButton.click();
    }
}
