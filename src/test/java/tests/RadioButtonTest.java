package tests;
import logical.Homepage;
import logical.RadioButton;

import org.testng.annotations.Test;

public class RadioButtonTest extends Base {

@Test(priority = 1)
    public void runHomepage() {

    Homepage home = new Homepage(driver);
    home.clickElement();
}

@Test(priority = 2)
    public void runRadio () {

    RadioButton rb = new RadioButton(driver);
    rb.selectRadio();
    rb.clickRadioButtons();
}
}
