package academy.softserve.edu.tests.administrator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwitchTabsTest {

    @Test
    public void testChrome(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://52.37.0.203:8080/oms5");
        System.out.println("Chrome browser opened and navigated to OMS site");
        driver.quit();
    }
}
