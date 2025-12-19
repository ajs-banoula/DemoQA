package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import java.time.Duration;

public class Base {

    protected WebDriver driver;

    @BeforeClass
    public void setUp() {

         driver = new ChromeDriver();

         driver.manage().window().maximize();
         driver.manage().deleteAllCookies();

         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://demoqa.com");

    }

//    @AfterClass
//    public void teardown() throws InterruptedException {
//        Thread.sleep(5000);
//        driver.close();
//
//    }

}
