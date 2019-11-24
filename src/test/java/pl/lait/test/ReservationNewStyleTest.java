package pl.lait.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pl.lait.pageObjects.MainPage;

public class ReservationNewStyleTest {
	
WebDriver driver;
MainPage mp;

	
	@Before
	public void openPage() {
		System.out.println("--wewn before");
		driver = Init.getDriver();
}

	@Test
	public void loginTest() {
		System.out.println("--wewn loginTest");
		MainPage mp = new MainPage(driver);
		mp.goToLoginPage();
		mp.loginAs("styko@wp.pl", "dupadupa");	
	}
	
	@Test
	public void fullReservationTest() {
		MainPage mp = new MainPage(driver);
		mp.goToLoginPage();
		mp.loginAs("styko@wp.pl", "dupadupa");
	}
	
	@After
	public void tearDown() {
		Init.end();
}
}