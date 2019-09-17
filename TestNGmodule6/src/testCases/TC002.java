package testCases;

import org.testng.Reporter;

import constantValues.TestData;
import driverScript.MainScript;
import uitility.ActionKeyWords;

public class TC002 {

	ActionKeyWords AK = new ActionKeyWords();
	TestData TD = new TestData();
	
	
	public void tc02() {
		try {
		AK.browserName(TD.browserName);
		AK.openURL(TD.openURL);
		}
		catch(Exception e) {
				MainScript.bValue = false;
				Reporter.log("Test case TC002 failed");
				e.printStackTrace();
		}
	}
}
