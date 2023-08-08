package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCustomerPage extends TestBase {

	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Bank & Cash')]")
	WebElement BankCashButton;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'New Account')]")
	WebElement NewAccountButton;
	@FindBy(how = How.XPATH, using = "//input[@id=\"account\"]")
	WebElement AccountTitle;
	@FindBy(how = How.XPATH, using = "//input[@id=\"description\"]")
	WebElement Description;
	@FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]")
	WebElement InitialBalance;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]")
	WebElement AccountNumber;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]")
	WebElement ContactPerson;
	@FindBy(how = How.XPATH, using = "//input[@id=\"contact_phone\"]")
	WebElement Phone;
	@FindBy(how = How.XPATH, using = "//input[@id=\"ib_url\"]")
	WebElement IntBankingUrl;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")
	WebElement SubmitButton;

//Methods to interact with
	public void userClicksOnBankCashButton() {
		BankCashButton.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void userClicksOnNewAccountButton() {
		NewAccountButton.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void userInputAccountTitle(String accountTitle) {
		AccountTitle.sendKeys(accountTitle);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void userInputDescription(String description) {
		Description.sendKeys(description);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void usersInitialBalance(String initialBalance) {
		InitialBalance.sendKeys(initialBalance);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void usersAccountNumber(String accountNumber) {
		AccountNumber.sendKeys(accountNumber);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void usersContactPerson(String contactPerson) {
		ContactPerson.sendKeys(contactPerson);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	public void usersPhoneNumber(String phone) {
		Phone.sendKeys(phone);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	public void usersInternetBankingUrl(String internetBankingUrl) {
		IntBankingUrl.sendKeys(internetBankingUrl);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	public void userClicksSummitButton() {
	    SubmitButton.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}

	}
}
