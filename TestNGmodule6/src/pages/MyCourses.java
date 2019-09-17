package pages;

import constantValues.LocatorValues;
import uitility.ActionKeyWords;

public class MyCourses {

	ActionKeyWords AK = new ActionKeyWords();
	LocatorValues LV = new LocatorValues();
	
	public void clickCourseLink() throws Exception {
		Thread.sleep(5000);
		AK.mouseHoveringWithClick(LV.CouresLocValue_MyCourses);
	}
	
	public void clickAllCourses() {
		AK.mouseHoveringWithClick(LV.AllCourses_Mycourses);
	}
}
