package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridExample {
	
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setPlatform(Platform.MAC);
		cap.setBrowserName("chrome");
		
		String sURL = "http://192.168.2.17:4444/wd/hub";
		
		WebDriver driver = new RemoteWebDriver(new URL(sURL),cap);
		
		driver.get("https://www.google.com");
		
		driver.quit();
	}

}
