package pl.lait.selenium1;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import okio.BufferedSink;
import pl.lait.pageObjects.LoginPage;
import pl.lait.pageObjects.Reservation2;
import pl.lait.pageObjects.ReservationPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Login2Test {
	WebDriver driver = null;

	@Before
	public void openPage() {
		driver = Init.getDriver();
	}

	@Ignore
	@Test
	public void login() {
		LoginPage loginPage = new LoginPage();
		loginPage.goToLoginPage();
		loginPage.loginAs("Wzorek5", "Stepien1");
	}

	@Ignore
	@Test
	public void reservation() {
		// 1- otwieramy przegladarke i logujemy sie do aplikacji
		LoginPage loginPage = new LoginPage();
		loginPage.goToLoginPage();
		loginPage.loginAs("Wzorek5", "Stepien1");
		// 2- na pierwszym ekranie po zalogowaniu się wypełniam formularz rezerwacji
		
		
		
		ReservationPage reservationPage = new ReservationPage();
		reservationPage.oneWayRadioClick();
		Init.sleep(1);
		reservationPage.roundTripRadioClick();
		Init.sleep(1);
		reservationPage.passengersCount("2");
		Init.sleep(1);
		reservationPage.passengersCount("3");
		reservationPage.fromPort("London");
		reservationPage.on("12", "1");
		reservationPage.arrivingInPort("Paris");
		reservationPage.returningDate("12", "20");
		reservationPage.businessClassClick();
		reservationPage.airline("No Preference");
		Init.sleep(4);
		reservationPage.continueBtnClick();
		Init.sleep(3);

		Reservation2 r2p = new Reservation2();
		r2p.radio2Click();
		r2p.radio6Click();
		r2p.continueBtnClick();
		Init.sleep(6);

		r2p.pass0("Kasia", "Wzorek", "No preference");
		Init.sleep(10);
		r2p.pass1("Wiktor", "Stępień", "Hindu");
		Init.sleep(10);
		r2p.pass2("Małgosia", "Sujak", "Bland");

		r2p.creditCard("MasterCard");
		r2p.securePurchaseClick();
		Init.sleep(10);
	}

	@After

	public void close() {
		Init.endTest();

	}
}
