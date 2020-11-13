package auto.tests;

import framework.core.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Homepage;

public class HomepageTests extends BaseTest{

    @Test
    public void homePage(){
        Homepage googleHomepage = new Homepage(getDriver());
        WebDriver driver = getDriver();
//        driver.get("https://google.com");
    }
}
