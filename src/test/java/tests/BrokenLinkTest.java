package tests;

import logical.Homepage;
import logical.BrokenLink;
import org.testng.annotations.Test;

import java.io.IOException;

public class BrokenLinkTest extends Base {

    @Test(priority = 1)
    public void runHomepage() {
        Homepage hm = new Homepage(driver);
        hm.clickElement();
    }
    @Test(priority = 2)
    public void runBrokenLink() throws IOException {
        BrokenLink bl = new BrokenLink(driver);
        bl.openBrokenLink();
        bl.screenshot();
        bl.openValidLink();
    }
}
