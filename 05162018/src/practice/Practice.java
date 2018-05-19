package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/Users/muhammedrislam/eclipse-workspace/05162018/driver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().fullscreen();
		//driver.get("http:www.facebook.com");
		driver.get("http:www.amazon.com");
	}

}
