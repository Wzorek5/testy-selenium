package pl.lait.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pl.lait.selenium1.Init;

public class Reservation2 {

	WebDriver driver;

	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]" + "/table/tbody/tr[4]/td/table/tbody/tr/td[2]"
			+ "/table/tbody/tr[5]/td/form/table[1]" + "/tbody/tr[3]/td[1]/input")
	WebElement radio2;

	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/" + "table/tbody/tr[4]/td/table/tbody/tr/td[2]/"
			+ "table/tbody/tr[5]/td/form/table[2]/" + "tbody/tr[5]/td[1]/input")
	WebElement radio6;

	@FindBy(name = "reserveFlights")
	WebElement continueBtn;

	// 3-i poziom rezerwacji

	@FindBy(name = "passFirst0")
	WebElement firstName;

	@FindBy(name = "passLast0")
	WebElement lastName;

	@FindBy(name = "pass.0.meal")
	WebElement meal;

	@FindBy(name = "passFirst1")
	WebElement passFirst1;

	@FindBy(name = "passLast1")
	WebElement passLast1;

	@FindBy(name = "pass.1.meal")
	WebElement pass1meal;

	@FindBy(name = "passFirst2")
	WebElement passFirst2;

	@FindBy(name = "passLast2")
	WebElement passLast2;

	@FindBy(name = "pass.2.meal")
	WebElement pass2meal;
	
	@FindBy(name = "creditCard")
	WebElement creditCard;
	
	@FindBy(name = "creditNumber")
	WebElement creditnumber;
	
	@FindBy(name = "securePurchaseClick")
	WebElement secureP;
	
	public Reservation2() {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}

	public void radio2Click() {
		radio2.click();
	}

	public void radio6Click() {
		radio6.click();
	}

	public void continueBtnClick() {
		continueBtn.click();
	}

	public void pass0(String firstName, String lastName, String meal) {
		this.firstName.sendKeys(firstName);
		this.lastName.sendKeys(lastName);
		Select m = new Select(this.meal);
		m.selectByVisibleText(meal);

	}

	public void pass1 (String firstName, String lastName, String meal) {
		passFirst1.sendKeys(firstName);
		
		passLast1.sendKeys(lastName);
		
		Select m = new Select(pass1meal);
		m.selectByVisibleText(meal);	
		
	}
	public void pass2 (String firstName, String lastName, String meal) {
		passFirst2.sendKeys(firstName);
		
		passLast2.sendKeys(lastName);
		
		Select m = new Select(pass2meal);
		m.selectByVisibleText(meal);	
	}
	public void creditCard(String name) {
		Select c = new Select(creditCard);
		c.selectByVisibleText(name);
	}
	public void creditNumber(String number) {
		creditnumber.sendKeys(number);
		
	}
	public void securePurchaseClick() {
		secureP.click();
	}
}