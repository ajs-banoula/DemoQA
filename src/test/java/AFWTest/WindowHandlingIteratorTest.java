package AFWTest;

import AFW.BrowserWindows;
import AFW.WindowHandlingIterator;
import org.testng.annotations.Test;

public class WindowHandlingIteratorTest extends Base {

    @Test(priority = 1)
    public void runBrowserWindows() {
        BrowserWindows bw = new BrowserWindows(driver);
        bw.removeAd();
        bw.openAlerts();
        bw.openBrowserTab();
    }
    @Test(priority = 2)
    public void WindowHandlingIterator() {
        WindowHandlingIterator whi = new WindowHandlingIterator(driver);
        whi.openNewtab();
        whi.switchTab();
    }
}
