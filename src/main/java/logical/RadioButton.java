package logical;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RadioButton {


    WebDriver driver;

    public RadioButton(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//ul[@class='menu-list']//span[text()='Radio Button']")
    private WebElement radioCard;

    @FindBy(xpath = "//label[@for='yesRadio']")
    private WebElement button;

    @FindBy(xpath ="//span[@class='text-success']")
    private WebElement successText;

    public void selectRadio(){

        radioCard.click();


    }
    public void clickRadioButtons() {

        button.click();
        String textValue = successText.getText();
        System.out.println("Displayed Text: " + textValue);
    }

}
