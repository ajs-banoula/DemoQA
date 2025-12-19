package tests;
import logical.Homepage;

import org.testng.annotations.Test;


public class HomepageTest extends Base {

    @Test
    public void runHomepage()  {

        Homepage home = new Homepage(driver);
        home.clickElement();

    }
}
