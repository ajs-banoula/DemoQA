package tests;
import logical.Homepage;
import logical.ClickButton;
import org.testng.annotations.Test;

public class DoubleClickTest extends Base{


    @Test(priority = 1)
    public void runHomepage(){
        Homepage hm = new Homepage(driver);
        hm.clickElement();

    }
    @Test(priority = 2)
    public void rundouble() {

        ClickButton dc = new ClickButton(driver);
        dc.navigatetoButtons();
        dc.performDoubleClick();
        dc.performRightClick();
        dc.printMessage();

    }
}
