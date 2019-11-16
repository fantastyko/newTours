package pl.lait.test;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Init {
	
	static WebDriver driver;
	public static WebDriver getDriver() {
		
		File file = new File ("C:/Users/jagna/Desktop/Tester/SeleniumLibs/chromedriver/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        System.out.println ("Hello! Odpalamy Chrome");
        driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/");
		
		return driver;
	}

}
