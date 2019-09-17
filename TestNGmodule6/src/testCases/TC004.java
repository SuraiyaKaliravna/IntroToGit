package testCases;

import org.testng.Reporter;

import driverScript.MainScript;
import pages.ALLcourses;

public class TC004 {
	ALLcourses AC = new ALLcourses();
	
	public void tc04() {
		
		try {
			AC.clickUserProfileLink();
			AC.clickSignOut();
		} catch (Exception e) {
			MainScript.bValue = false;
			Reporter.log("Test case TC004 failed");
			e.printStackTrace();
		}
	}
}
