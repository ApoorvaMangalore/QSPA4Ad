package systemTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class To_launch_Apple_Test {

@Test(groups = "mobile")
	public void apple() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apple.com/in");
		driver.quit();
	}
}
