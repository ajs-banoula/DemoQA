package AFWTest;

import AFW.BrowserWindows;
import org.testng.annotations.Test;

public class BrowserWindowTest extends Base {

@Test(priority = 1)

    public void runBrowserWindows() {
    BrowserWindows bw = new BrowserWindows(driver);
    bw.openAlerts();
    bw.openBrowserTab();
}
}
