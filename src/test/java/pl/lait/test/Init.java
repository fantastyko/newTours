package pl.lait.test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Init {

	static WebDriver driver = null;

	public static WebDriver getDriver() {

		if (driver == null) {
			System.out.println("--wewn getDriver");
			File file = new File("C:/Users/jagna/Desktop/Tester/SeleniumLibs/chromedriver/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			//driver = new ChromeDriver();
			URL remoteAdress = null;
			try {
				remoteAdress = new URL("http://192.168.0.109:4444/wd/hub");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			driver = new RemoteWebDriver(remoteAdress, capabilities);
			//USTAWIENIE OPÓŹNIENIA WYKONANIA AKCJI
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			//GLOBALNE USTAWIENIA ROZMIARU OKNA PRZEGLĄDARKI
			Dimension rozmiarOkna = driver.manage().window().getSize();
				int wys = rozmiarOkna.height;
				int szer = rozmiarOkna.width;
				System.out.println("Rozmiar okna to"
						+ " to: " + wys + "x" + szer);
			driver.get("http://newtours.demoaut.com/");

			return driver;
		} else {
			return driver;
		}

	}

	public static void end() {
		driver.quit();
		driver = null;
	}


}
