package AFW;

import java.time.Duration;
import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.FindBy;

public class WindowHandlingIterator {

    WebDriver driver;
    JavascriptExecutor je;
    WebDriverWait wait;

    public WindowHandlingIterator(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        je = (JavascriptExecutor)driver;
    }

    @FindBy(id = "tabButton")
    private WebElement newTab;

    public void scrollClick(WebElement element) {
        je.executeScript("arguments[0].scrollIntoView(true);", element);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();

    }
    public void openNewtab() {
        scrollClick(newTab);

    }
    public void switchTab() {
        Set <String> windowId = driver.getWindowHandles();
        Iterator <String> itr = windowId.iterator();

        String parent_Window = itr.next();
        System.out.println(parent_Window);

        String child_window = itr.next();
        System.out.println(child_window);

        driver.switchTo().window(child_window);
        WebElement heading = driver.findElement(By.id("sampleHeading"));
        String newHeading = heading.getText();
        System.out.println(newHeading);

        driver.switchTo().window(child_window);
    }

}
