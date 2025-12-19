package tests;

import logical.Homepage;
import logical.Text;
import org.testng.annotations.Test;

public class TextTest extends Base {


    @Test (priority = 1)
    public void runHomepage()  {

        Homepage home = new Homepage(driver);
        home.clickElement();
    }

    @Test (priority = 2)
    public void runTextBox() throws InterruptedException{
        Text text = new Text(driver);
        text.clickTextBox();
        text.enterFullName();
        text.enterUserEmail();
        text.enterAddress();
        text.setPermAddress();
        text.clickSubmit ();
        text.scrollUp();
    }
}
