package logical;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.ElementClickInterceptedException;

public class  Homepage {

    WebDriver driver;
    JavascriptExecutor je;

    public Homepage(WebDriver driver) {

        this.driver = driver;
        je = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//h5[text()='Elements']")
    private WebElement elementsCard;

    public void clickElement() {

        try {
            // 1️⃣ Scroll element into view
            je.executeScript("arguments[0].scrollIntoView(true);", elementsCard);

            // 2️⃣ Trying normal Selenium click first
            elementsCard.click();
        } catch (ElementClickInterceptedException e) {
            // 3️⃣ If blocked by overlay, removing it and clicking via JS
            je.executeScript(
                    "document.getElementById('fixedban')?.remove(); arguments[0].click();",
                    elementsCard
            );

        }
    }
}
