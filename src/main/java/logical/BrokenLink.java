package logical;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BrokenLink {

    private WebDriver driver;
    JavascriptExecutor je;

    public BrokenLink(WebDriver driver) {
        this.driver = driver;
        je = (JavascriptExecutor)driver;
        PageFactory.initElements(driver,this);
    }
    //Locators
    @FindBy(xpath = "//ul[@class='menu-list']//span[text()='Broken Links - Images']")
    private WebElement BrokenLinkTab;

    @FindBy(xpath = "//div[@class='col-12 mt-4 col-md-6']//img[@src='/images/Toolsqa.jpg']")
    private WebElement Logo;

    @FindBy(xpath = "//div[@class='col-12 mt-4 col-md-6']//a[@href='http://demoqa.com']")
    private WebElement validLink;

    public void openBrokenLink() {
        je.executeScript("arguments[0].scrollIntoView(true);",BrokenLinkTab);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(BrokenLinkTab));
        BrokenLinkTab.click();
    }
    public void screenshot() throws IOException {

        String path = "C:\\Users\\Acer\\OneDrive\\Desktop\\Demoqa.jpg";
        File logo = Logo.getScreenshotAs(OutputType.FILE);
        File obj = new File(path);
        FileHandler.copy(logo, obj);
        System.out.println("The screenshot of the logo has been taken and stored");
    }
    public void openValidLink() {

        je.executeScript("arguments[0].scrollIntoView(true);",validLink);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(validLink));
        validLink.click();
        driver.navigate().back();

    }
}
