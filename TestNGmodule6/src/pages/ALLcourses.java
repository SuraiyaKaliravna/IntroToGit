package pages;

import constantValues.LocatorValues;
import uitility.ActionKeyWords;

public class ALLcourses {
	ActionKeyWords AK = new ActionKeyWords();
	LocatorValues LV = new LocatorValues();
	
	public void clickUserProfileLink() {
		AK.handlingClick(LV.UserProfileLink_AllCourses);
	}
	
	public void clickSignOut() throws Exception {
		AK.handlingClick(LV.logoutLink_AllCourses);
		Thread.sleep(5000);
	}
}
