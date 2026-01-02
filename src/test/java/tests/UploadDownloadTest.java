package tests;
import logical.Homepage;
import logical.UploadDownload;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import listeners.CustomListener;

@Listeners(CustomListener.class)
public class UploadDownloadTest extends Base {

    @Test (priority = 1)
    public void runHomepage() {
        Homepage hm = new Homepage(driver);
        hm.clickElement();
    }

    @Test(priority = 2)
    public void runUploadDownload() {
        UploadDownload ud = new UploadDownload(driver);
        ud.clickUploadDownloadTab();
        ud.clickDownload();
    }
}
