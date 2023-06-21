package step_definations;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Customer_Login_Functionality extends Base{
	@When("I click on login menu")
	public void i_click_on_login_menu() throws InterruptedException {
		click(By.xpath("//a[text()='LOG IN']")); 
	}

	
//	@Then("click on Customer login menu")
//	public void click_on_Customer_login_menu() throws InterruptedException {
//		click(By.xpath("//a[text()='Customer Login']")); 
//	}

	@Then("enter User Id as david@gmail.com")
	public void enter_user_id_as_david_gmail_com() throws InterruptedException {
		 sendkeys(By.name("mailuid"), "david@gmail.com");
	}

	@Then("enter password as {int}")
	public void enter_password_as(Integer int1) throws InterruptedException {
		 sendkeys(By.name("pwd"), "1234");
	}

	@Then("I click on login Button")
	public void i_click_on_login_button() throws InterruptedException {
		 click(By.name("login-submit"));
	}

	@Then("verify I am in my home page")
	public void verify_i_am_in_my_home_page() {
		String t = getElementText(By.xpath("//h2[text()='Welcome David']"));
		assertEquals("Welcome David", t);
	}



}
