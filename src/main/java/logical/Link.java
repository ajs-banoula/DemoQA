package logical;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Link {

    WebDriver driver;
    WebDriverWait wait;

    public Link(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ul[@class='menu-list']//span[text()='Links']")
    private WebElement link;

    @FindBy(id = "created")
    private WebElement create;

    @FindBy(id="linkResponse")
    private WebElement apiResponse;

    @FindBy(id = "no-content")
    private WebElement noContent;

    @FindBy(id = "moved")
    private WebElement contentMoved;

    @FindBy(id = "bad-request")
    private WebElement badReq;

    @FindBy(id = "unauthorized")
    private WebElement unAuth;

    //opens the new tab
    public void clickLink() {
        link.click();
    }

    public void clickandprint(WebElement element,  String statuscode) {

        element.click();

        wait.until(ExpectedConditions.textToBePresentInElement(apiResponse, statuscode));
        System.out.println(apiResponse.getText());
    }

    //clicking links and printing the messages
    public void apiCreated() throws InterruptedException {
        Thread.sleep(900);
        clickandprint(create, "201");
    }
    public void apiNocontent() throws InterruptedException {
        Thread.sleep(900);
        clickandprint(noContent, "204");

    }
    public void apiMoved() throws InterruptedException {
        Thread.sleep(850);
      clickandprint(contentMoved, "301");

    }

    public void apiBadRequest(){
        clickandprint(badReq, "400");
    }

    public void apiUnauth() {
        clickandprint(unAuth, "401");
    }
}
