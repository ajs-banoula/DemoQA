package tests;

import logical.Homepage;
import logical.CheckBox;
import org.testng.annotations.Test;


public class CheckBoxTest extends Base {

    @Test(priority = 1)
    public void runHomepage()  {

        Homepage home = new Homepage(driver);
        home.clickElement();
    }

    @Test(priority = 2)
    public void runClickCheckBox(){

        CheckBox cb = new CheckBox(driver);
        cb.clickCheckBox();
        cb.expand();
        cb.selectDesktop();
        cb.getMessage();
        cb.collapse();

    }
}
