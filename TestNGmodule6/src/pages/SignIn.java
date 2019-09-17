package pages;

import constantValues.LocatorValues;
import constantValues.TestData;
import uitility.ActionKeyWords;

public class SignIn {

	LocatorValues LV = new LocatorValues();
	TestData TD = new TestData();
	ActionKeyWords AK = new ActionKeyWords();
	
	public void clickSignInLink(){
		AK.handlingClick(LV.LoginLocatorValue_SignIn);
	}
	
	public void enterUserName() throws Exception {
		Thread.sleep(1000);
		AK.handlingTextBox(LV.UserNameLocatorValue_SignIn, TD.userName);
	}
	
	public void enterPassword() throws Exception {
		Thread.sleep(2000);
		AK.handlingTextBox(LV.PasswordLocatorValue_SignIn, TD.password);
	}
	
	public void clickSignInButton() {
		AK.handlingClick(LV.LoginButtonLocatorValue_SignIn);
		
	}
}
