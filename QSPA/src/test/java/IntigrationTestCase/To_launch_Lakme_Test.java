package IntigrationTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class To_launch_Lakme_Test {
	@Test(groups = "beauty")
	public void lakmeindia() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.lakmeindia.com");
		driver.quit();
	}
}
