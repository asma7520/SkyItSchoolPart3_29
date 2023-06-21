package step_definations;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Customer_Contact_Number_Modification_Functionality extends Base {

	@Given("I am in landing page http:\\/\\/it.microtechlimited.com")
	public void i_am_in_landing_page_http_it_microtechlimited_com() throws InterruptedException {
		Thread.sleep(2000);
		navigateURL(" http://it.microtechlimited.com");
	}

	@When("I Click on Login Menu button")
	public void i_click_on_login_menu_button() throws InterruptedException {
		Thread.sleep(2000);
	   click(By.xpath("//a[@href='elogin.php']"));
	}


	@When("I Click on Customer Login button")
	public void click_on_customer_login_button() throws InterruptedException {
		Thread.sleep(2000);
		click(By.xpath("//a[@href='clogin.php']"));
	}
	
	
	@Then("Enter User Id as david@gmail.com          -- called Test Step")
	public void enter_user_id_as_david_gmail_com_called_test_step() throws InterruptedException {
		Thread.sleep(2000);
		sendkeys(By.xpath("//input[@name='mailuid']"), "david@gmail.com");
	}

	@Then("I Enter Password as {int}")
	public void i_enter_password_as(Integer int1) throws InterruptedException {
		Thread.sleep(2000);
		sendkeys(By.xpath("//input[@name='pwd']"), "1234");
	}

	@Then("I Click on Login Button")
	public void i_click_on_login_button() throws InterruptedException {
		Thread.sleep(2000);
		click(By.name("login-submit"));
	}

	@Then("Verify that I am in Home Page")
	public void verify_that_i_am_in_home_page() {
		String s = getElementText(By.xpath("//h2[text()='Welcome David']"));
		assertEquals("Welcome David", s);
	}

	@Then("I Click on Profile Menu")
	public void i_click_on_profile_menu() throws InterruptedException {
		click(By.xpath("//a[text()='My Profile']"));
	}

	@Then("I Click on Update Info")
	public void i_click_on_update_info() throws InterruptedException {
		click(By.xpath("//button[text()='Update Info']"));
	}

	@Then("I Replace the Contact Number to {string}")
	public void i_replace_the_contact_number_to(String contact) throws InterruptedException {
		clear(By.name("contact"));
		sendkeys(By.name("contact"), contact);
	}

	@Then("I Click Submit button")
	public void i_click_submit_button() throws InterruptedException {
		click(By.name("update"));
	}

	@Then("Verify Contact Number is changed to {string}")
	public void verify_contact_number_is_changed_to(String expectedValue) throws InterruptedException {
		String actualValue = getattributeValue(By.name("contact"), "value");
		assertEquals(expectedValue, actualValue);
	}

}
