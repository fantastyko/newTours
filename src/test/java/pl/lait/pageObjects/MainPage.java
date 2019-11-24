package pl.lait.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.lait.test.Init;

public class MainPage {

	WebDriver driver;
	// Main Page part
	@FindBy(linkText = "SIGN-ON")
	WebElement signOnLink;

	@FindBy(linkText = "REGISTER")
	WebElement registerLink;

	@FindBy(linkText = "SUPPORT")
	WebElement supportLink;

	@FindBy(linkText = "CONTACT")
	WebElement contactLink;

	// Login Page part
	@FindBy(name = "userName")
	WebElement loginInput;

	@FindBy(name = "password")
	WebElement passwordInput;

	@FindBy(name = "login")
	WebElement loginButton;

	public MainPage(WebDriver driver) {
		System.out.println("--wewn konstruktor MainPage");
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	public void goToLoginPage() {
		signOnLink.click();
	}

	public void loginAs(String login, String password) {
		loginInput.sendKeys(login);
		passwordInput.sendKeys(password);
		loginButton.click();
	}

}
