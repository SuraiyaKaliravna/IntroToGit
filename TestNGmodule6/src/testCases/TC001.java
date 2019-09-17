package testCases;

import org.testng.Reporter;

import driverScript.MainScript;
import pages.SignIn;

public class TC001 {

	SignIn SI = new SignIn();
	
	public void tc01() {
		
		try {
			SI.clickSignInLink();
			SI.enterUserName();
			SI.enterPassword();
			SI.clickSignInButton();
			
		} catch (Exception e) {
			MainScript.bValue = false;
			Reporter.log("Test case TC001 failed");
			e.printStackTrace();
		}
		
	}
}
