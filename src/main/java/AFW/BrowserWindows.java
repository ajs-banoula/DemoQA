package AFW;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrowserWindows {

    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor je;
    public BrowserWindows(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        je = (JavascriptExecutor)driver;


    }

    @FindBy(xpath = "//h5[text() = 'Alerts, Frame & Windows']")
    private WebElement afw;

    @FindBy(xpath = "//ul[@class='menu-list']//span[text() = 'Browser Windows']" )
    private WebElement browserTab;

    @FindBy(xpath = " //idframe[@id= 'google_ads_iframe']")
    private WebElement ad;

    public void removeifAdpresent() {

        try {
            je.executeScript("arguments[0].style.display='none';", ad);
        } catch (Exception e) {

            System.out.println("Ad not found: Continuing....");
        }

    }
    public void openAlerts() {

        removeifAdpresent();

        afw.click();
    }
    public void openBrowserTab () {
        browserTab.click();

    }

}
