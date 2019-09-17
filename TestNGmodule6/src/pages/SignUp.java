package pages;

import org.openqa.selenium.Keys;

import constantValues.LocatorValues;
import constantValues.TestData;
import uitility.ActionKeyWords;

public class SignUp {
	
	TestData TD = new TestData();
	ActionKeyWords AK = new ActionKeyWords();
	LocatorValues LV = new LocatorValues();
	
	public void clickSignUpLink() {
		AK.handlingClick(LV.SignUpLink_EdurekaHomePage);
	}
	
	public void enterEmailID() throws Exception {
		for(int i=0; i<30; i++) {
		AK.handlingKeyboardKey(LV.EnterEmail_SignUp, Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		AK.handlingTextBox(LV.EnterEmail_SignUp, TD.emailSignUp);
	}

	public void enterPhoneNum() throws Exception {
		for(int i=0; i<11; i++) {
			AK.handlingKeyboardKey(LV.EnterPhoneNum_SignUp, Keys.BACK_SPACE);
			}
		Thread.sleep(1000);
		AK.handlingTextBox(LV.EnterPhoneNum_SignUp, TD.phoneNum);
	}
	
	public void ClickTC() {
		AK.handlingClick(LV.AgreeTC_SignUp);
	}
	
	public void clickSignUPButton() {
		AK.handlingClick(LV.SignUpLink_SignUp);
	}
	
	public void ErrorMsg() {
		AK.FetchingValue(LV.EmailError_Signup);
	}
	
}
