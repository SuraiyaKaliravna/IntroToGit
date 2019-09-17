package testCases;

import org.testng.Reporter;

import driverScript.MainScript;
import pages.MyCourses;
import pages.UserHomePAge;

public class TC003 {

	UserHomePAge HP = new UserHomePAge();
	MyCourses MC = new MyCourses();
	
	public void tc03() {
		
		try {
			MC.clickCourseLink();
			MC.clickAllCourses();
		} catch (Exception e) {
			MainScript.bValue = false;
			Reporter.log("Test case TC003 failed");
			e.printStackTrace();
		}
		
	}
}
