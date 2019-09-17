package pages;

import constantValues.LocatorValues;
import uitility.ActionKeyWords;

public class UserHomePAge {

	ActionKeyWords AK = new ActionKeyWords();
	LocatorValues LV = new LocatorValues();
	
	public void ClickMyCourses() {
		AK.mouseHoveringWithClick(LV.MycourseLocValue_HomePage);
		
	}
}
