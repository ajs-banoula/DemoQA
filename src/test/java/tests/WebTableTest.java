package tests;

import logical.Homepage;
import logical.WebTable;
import org.testng.annotations.Test;

public class WebTableTest extends Base {

    @Test(priority = 1)
    public void runHomepage() {
        Homepage hm = new Homepage(driver);
        hm.clickElement();
    }

    @Test(priority = 2)
    public void runWebTable() {
        WebTable wt = new WebTable(driver);
        wt.webTable();
        wt.setNewRecord();
        wt.setFirstName("Brock");
        wt.setLastName("Lesnar");
        wt.setUserEmail("bl@gmail.com");
        wt.setAge("55");
        wt.setSalary("45000");
        wt.setDepartment("Marketing");
        wt.clickSubmit();
    }

}
