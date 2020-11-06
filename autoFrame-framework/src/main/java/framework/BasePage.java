package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {
    private static final int TIMEOUT= 5;
    private static final int POLLING= 10;

    protected WebDriver driver;
    private WebDriverWait wait;
}
