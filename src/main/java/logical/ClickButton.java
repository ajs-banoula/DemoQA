package logical;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickButton {

    WebDriver driver;
    Actions a;

    public ClickButton(WebDriver driver) {

        this.driver = driver;
        a = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ul[@class='menu-list']//span[text()='Buttons']")
    private WebElement buttons;

    @FindBy(id = "doubleClickBtn")
    private WebElement doubleButton;

    @FindBy(id = " rightClickBtn")
    private WebElement rightClick;

    @FindBy(id = "doubleClickMessage")
    private WebElement msg;

    public void navigatetoButtons() {
        buttons.click();
    }
    public void performDoubleClick() {

        a.doubleClick(doubleButton).perform();
    }

    public void performRightClick(){
        a.contextClick(rightClick);

    }

    public void printMessage() {

        String message = msg.getText();
        System.out.println("The message is : " + message);
    }
}

