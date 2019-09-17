package testCases;

import org.testng.Reporter;

import driverScript.MainScript;
import pages.SignUp;

public class TC005 {

	SignUp SP = new SignUp();
	
	public void tc05() {
		
		try {
			SP.clickSignUpLink();
			SP.enterEmailID();
			SP.enterPhoneNum();
			SP.ClickTC();
			SP.clickSignUPButton();
			SP.ErrorMsg();
		} catch (Exception e) {
			MainScript.bValue = false;
			Reporter.log("Test case TC005 failed");
			e.printStackTrace();
		}	
		
	}
}
