package logical;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UploadDownload {

    private WebDriver driver;
    private JavascriptExecutor je;
    private WebDriverWait wait;

    public UploadDownload (WebDriver driver) {

        this.driver = driver;
        this.je = (JavascriptExecutor)driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//ul[@class='menu-list']//li[@id='item-7']")
    private WebElement uploadTab;

    @FindBy(id="downloadButton")
    private WebElement downloadButton;

    public void scrollClick(WebElement element) {
        je.executeScript("arguments[0].scrollIntoView(true);", element);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void clickUploadDownloadTab() {
        scrollClick(uploadTab);
    }

    public void clickDownload() {
        scrollClick(downloadButton);
    }
}
