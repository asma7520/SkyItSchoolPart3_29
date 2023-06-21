package step_definations;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Update_My_Profile_Functionality extends Base {
	@Given("I am in Landing Page")
	public void i_am_in_landing_page() throws InterruptedException {
		navigateURL(" http://it.microtechlimited.com"); 
	}

	@Then("click on Customer login menu")
	public void click_on_customer_login_menu() throws InterruptedException {
		click(By.xpath("//a[text()='Customer Login']"));
	}

	@Then("Click on My Profile on customer welcome page")
	public void click_on_my_profile_on_customer_welcome_page() throws InterruptedException {
		click(By.xpath("//a[text()='My Profile']"));
	}

	@Then("Click on Update Info")
	public void click_on_update_info() throws InterruptedException {
		click(By.xpath("//button[text()='Update Info']"));
	
	Thread.sleep(34555);
	
	}

	@Then("Clear and Enter First name")
	public void clear_and_enter_first_name() throws InterruptedException {
		clear(By.xpath("//input [name='contact']"));
		sendkeys(By.xpath("//input [name='contact']"),"David");
	}

	@Then("Clear and Enter Last Name")
	public void clear_and_enter_last_name() throws InterruptedException {
		clear(By.name("lastName"));
		sendkeys(By.name("lastName"),"Rahman");
	}

	@Then("Clear and Enter DOB")
	public void clear_and_enter_dob() throws InterruptedException {
		clear(By.name("birthday"));
		sendkeys(By.name("birthday"), "2000 01 03");
	}

	@Then("Clear and Enter Gender")
	public void clear_and_enter_gender() throws InterruptedException {
		clear(By.name("gender"));
		sendkeys(By.name("gender"),"F");
	}

	@Then("Clear and Enter Phone Number")
	public void clear_and_enter_phone_number() throws InterruptedException {
		clear(By.name("contact"));
		sendkeys(By.name("contact"), "8707181204");
	}

	@Then("Clear and Enter Address")
	public void clear_and_enter_address() throws InterruptedException {
		clear(By.name("address"));
		sendkeys(By.name("address"),"Arkasas");
	}

	@Then("Click on Submit")
	public void click_on_submit() throws InterruptedException {
		click(By.name("update"));
	}

	@Then("Verify On Update Page My Info")
	public void verify_on_update_page_my_info() {
		String s = getElementText(By.xpath("//h2[text()='My Info']"));
		assertEquals("My Info",s); 
	}

	@Then("Verify Phone Number on Update?Info?Page")
	public void verify_phone_number_on_update_info_page() throws InterruptedException {
		String v = getattributeValue(By.xpath("//input[@type='number']"),"value");
		assertEquals("8707181204",v);
	}


}
