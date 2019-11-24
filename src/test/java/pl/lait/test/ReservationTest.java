package pl.lait.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ReservationTest {

	
WebDriver driver;
	
	@Before
	public void openPage() {
		driver = Init.getDriver();
		
	}
		
	@Test
	public void login() {
		//Przejście na okno logowania
		driver.findElement(By.linkText("SIGN-ON")).click();
		//Uzupełnienie formularza
		driver.findElement(By.name("userName")).sendKeys("styko@wp.pl");
		driver.findElement(By.name("password")).sendKeys("dupadupa");
		//klinięcie Login
		driver.findElement(By.name("login")).click();
		
	}
	
	@Test
	public void register() {
		//Przejście na okno rejestracji
		driver.findElement(By.linkText("REGISTER")).click();
		//Uzupełnienie formularza
		driver.findElement(By.name("userName")).sendKeys("styko@wp.pl");
		driver.findElement(By.name("password")).sendKeys("dupadupa");
		driver.findElement(By.name("confirmPassword")).sendKeys("dupadupa");
		//klinięcie Register
		driver.findElement(By.name("register")).click();
	
	}
	
	@Test
	public void wybierzLot() {
		//Przejście na okno logowania
		driver.findElement(By.linkText("SIGN-ON")).click();
		//Uzupełnienie formularza
		driver.findElement(By.name("userName")).sendKeys("styko@wp.pl");
		driver.findElement(By.name("password")).sendKeys("dupadupa");
		//klinięcie Login
		driver.findElement(By.name("login")).click();
		//Wybierz radiobuttony
		String oneWayXpath = "/html/body/div/table/tbody/tr/td[2]"
				+ "/table/tbody/tr[4]/td/table/tbody/tr/td[2]/"
				+ "table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]"
				+ "/b/font/input[2]";
		driver.findElement(By.xpath(oneWayXpath)).click();
		//1.Wybierz listę rozwijaną liczba pasażerów
		Select Passengers = new Select (driver.findElement(By.name("passCount")));
		Passengers.selectByVisibleText("2");
		//2.Wybierz listę rozwijaną odlot
		Select odlot = new Select (driver.findElement(By.name("fromPort")));
		odlot.selectByIndex(5);
		//3.Wbierz listę rozwijaną Miesiąc odlotu
		Select monthDep = new Select (driver.findElement(By.name("fromMonth")));
		monthDep.selectByValue("3");
		//4.Wbierz listę rozwijaną Dzień odlotu
		Select dayDep = new Select (driver.findElement(By.name("fromDay")));
		dayDep.selectByValue("15");
		//5.Wbierz listę rozwijaną Przylot
		Select przylot = new Select (driver.findElement(By.name("toPort")));
		przylot.selectByIndex(4);
		//6.Wbierz listę rozwijaną Miesiąc Przylotu
		Select monthArr = new Select (driver.findElement(By.name("toMonth")));
		monthArr.selectByValue("6");
		//7.Wbierz listę rozwijaną Dzień odlotu
		Select dayArr = new Select (driver.findElement(By.name("toDay")));
		dayArr.selectByValue("12");
		//Wybierz klasę
		String XpathKlasa = "/html/body/div/table/tbody/tr/td[2]/table/"
				+ "tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]"
				+ "/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]";
		driver.findElement(By.xpath(XpathKlasa)).click();
		//Wybierz przewoznika
		Select przewoznik = new Select (driver.findElement(By.name("airline")));
		przewoznik.selectByIndex(2);
		//kliknięcie submit
		driver.findElement(By.name("findFlights")).click();
		
				
	}
		
	@After
	public void tearDown() {
		Init.end();
		}

}
