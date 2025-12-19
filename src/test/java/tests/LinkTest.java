package tests;
import logical.Homepage;
import logical.Link;
import org.testng.annotations.Test;

public class LinkTest extends Base {

    @Test(priority = 1)
    public void runHomepage() {

        Homepage hm = new Homepage(driver);
        hm.clickElement();
    }

    @Test(priority = 2)
    public void runLink() throws InterruptedException{
        Link li = new Link(driver);
        li.clickLink();
        li.apiCreated();
        li.apiNocontent();
        li.apiMoved();
        li.apiBadRequest();
        li.apiUnauth();

    }
}
