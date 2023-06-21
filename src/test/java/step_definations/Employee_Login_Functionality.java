package step_definations;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Employee_Login_Functionality extends Base{
	@Given("I am in landing page")
	public void i_am_in_landing_page() throws InterruptedException {
		navigateURL("http://it.microtechlimited.com");
	}

	@When("I click on Login menu")
	public void i_click_on_login_menu() throws InterruptedException {
		click(By.xpath("//a[text()='LOG IN']"));
	    
	}

	@Then("Click on Employee Login Menu")
	public void click_on_employee_login_menu() throws InterruptedException {
		click(By.xpath("//a[text()='Employee Login']"));
	}

	@Then("Enter User Id as testpilot@gmail.com")
	public void enter_user_id_as_testpilot_gmail_com() throws InterruptedException {
	    sendkeys(By.name("mailuid"), "testpilot@gmail.com");
	}

	@Then("Enter Password as {int}")
	public void enter_password_as(Integer int1) throws InterruptedException {
	    sendkeys(By.name("pwd"), "1234");
	}

	@Then("I click on Login Button")
	public void i_click_on_login_button() throws InterruptedException {
	   click(By.name("login-submit"));
	}

	@Then("Verify I am in my Home Page")
	public void verify_i_am_in_my_home_page() {
		String t = getElementText(By.xpath("//h2[text()='Welcome Test ']"));
		assertEquals("Welcome Test ", t);
	}


}
