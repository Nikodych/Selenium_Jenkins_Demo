package academy.softserve.edu.tests.administrator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwitchTabsTest {

    @Test
    public void testChrome(){
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://bimarian.com");
        System.out.println("Chrome browser opened and navigated to Bimarian site");
        driver.quit();
    }
}
