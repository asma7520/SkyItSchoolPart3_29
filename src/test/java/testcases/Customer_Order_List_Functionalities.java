package testcases;

import org.junit.Test;
import org.openqa.selenium.By;

import base.Base;

public class Customer_Order_List_Functionalities extends Base{
	//test annotation of junit
	
  @Test
	public void customer_Order_List_Functionalities() throws InterruptedException {
	  
	// public static void main(String[] args) {

			/*
			 * Test Case: Verify order list functionalty
			 *  Test step: 
			 *  1. Navigate to http://it.microtechlimited.com
			 *  2. Click on Login Menu 
			 *  3. Click on Customer Login
			 *  4. Enter User Id as david@gmail.com
			 *  5. Enter Password as 1234
			 *  6. Click Login Button
			 *  7. Verify I am in Home Page
			 *  8.click on order list
			 */
			 
		
		//I am in Landing page
		
		navigateURL("http://it.microtechlimited.com");
		
		// I click on Customer Login
		
		click(By.linkText("LOG IN"));
		
		
		
		
	}
	
	
	
	
	
	
	
		

	}


