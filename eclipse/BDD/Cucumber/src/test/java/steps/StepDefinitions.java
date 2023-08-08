package steps;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.AddCustomerPage;
import pages.LoginPage;
import pages.TestBase;

public class StepDefinitions extends TestBase {
	LoginPage loginPage;
	AddCustomerPage addCustomerPage;

	String getRndmString() {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder rndmStr = new StringBuilder();
		Random rnd = new Random();
		while (rndmStr.length() < 18) { // length of the random string.
			int index = (int) (rnd.nextFloat() * chars.length());
			rndmStr.append(chars.charAt(index));
		}
		String saltStr = rndmStr.toString();
		return saltStr;
	}

	@Before
	public void setUp() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
	}

	@Given("User is on the techfios login page")
	public void user_is_on_the_techfios_login_page() {

		driver.get("https://www.techfios.com/billing/?ng=admin/");

	}

	@When("User enters the {string} in the {string} field")
	public void user_enters_the_in_the_field_Username(String logindata, String field) {
		switch (field) {
		case "username":
			loginPage.enterUserName(logindata);
			break;
		case "password":
			loginPage.enterPassword(logindata);

		}
	}

	@And("User clicks on {string}")
	public void user_clicks_on_login(String clickButtons) {
		switch (clickButtons) {
		case "login":
			loginPage.clickSignInButton();
			break;
		case "bankCash":
			addCustomerPage.userClicksOnBankCashButton();
			break;
		case "newAccount":
			addCustomerPage.userClicksOnNewAccountButton();
			break;
		case "submit":
			addCustomerPage.userClicksSummitButton();
		default:
			break;
		}
	}

	@Then("User should land on dashboard page")
	public void user_should_land_on_dashboard_page() {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);

	}

	@Then("User should land on Account Page")
	public void user_should_land_on_Account_Page() {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);

	}

	@Then("User enters {string} in the {string} field on account page")
	public void user_enters_accountTitle_field_in_accounts_page(String stringData, String customersInfo) {
		switch (customersInfo) {
		case "accountTitle":
			addCustomerPage.userInputAccountTitle(stringData + getRndmString());
			break;

		}
		switch (customersInfo) {
		case "description":
			addCustomerPage.userInputDescription(stringData + getRndmString());
			break;

		}
		switch (customersInfo) {
		case "initialBalance":
			addCustomerPage.usersInitialBalance(stringData + getRndmString());
			break;

		}
		switch (customersInfo) {
		case "accountNumber":
			addCustomerPage.usersAccountNumber(stringData + getRndmString());
			break;

		}
		switch (customersInfo) {
		case "contactPerson":
			addCustomerPage.usersContactPerson(stringData + getRndmString());

		}
		switch (customersInfo) {
		case "phone":
			addCustomerPage.usersPhoneNumber(stringData + getRndmString());
			break;

		}
		switch (customersInfo) {
		case "internetBankingUrl":
			addCustomerPage.usersInternetBankingUrl(stringData + getRndmString());

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
				break;
			}
		}
	}

	@Then("User should be able to validate account created successfully")
	public void user_should_be_able_to_validate_account_created_successfully() {
		String expected = "Accounts- iBilling";
		String actual = driver.getTitle();
		Assert.assertEquals("Page not found", expected, actual);
		System.out.println(actual);

	}

//	  @After public void tearDown() { driver.close(); driver.quit(); }

}
