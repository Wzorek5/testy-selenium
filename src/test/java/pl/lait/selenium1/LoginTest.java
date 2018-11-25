package pl.lait.selenium1;


import org.junit.*;
import org.openqa.selenium.*;

public class LoginTest {

	WebDriver driver = null;
	
	@Before
	public void openPage() {
		driver = Init.getDriver();
	}
	
	@Test
	public void clickOnMenuItems() {
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.linkText("SUPPORT")).click();
		driver.findElement(By.linkText("CONTACT")).click();
		
		driver.findElement(By.linkText("SIGN-ON")).click();
    	driver.findElement(By.name("userName")).sendKeys("Wzorek5");
    	driver.findElement(By.name("password")).sendKeys("Stepien1");
    	driver.findElement(By.name("login")).click();
	}
	@After
	public void close( ) {
		Init.endTest();
		
		
		
		
		
	}
	
	
	
}
