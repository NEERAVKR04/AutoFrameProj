package auto.tests.homepage;
import org.testng.annotations.Test;
import auto.framework.core.BaseTest;
import auto.page.homepage.homepage;

public class HomepageTests extends BaseTest{
    @Test
    public void HomepageTests() {
        Homepage Homepage = new Homepage(getDriver());
    }
}
