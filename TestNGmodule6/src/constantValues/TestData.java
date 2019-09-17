package constantValues;

import uitility.ExcelReadWrite;

public class TestData {
	
	//----------------------------------------------------------------------------
	//----------------------------------------------------------------------------
	//----------------------------------------------------------------------------
	//----------------------------------------------------------------------------
	//----------------------------------------------------------------------------

	ExcelReadWrite ER = new ExcelReadWrite();
	
	public final String filePath = "C:\\Users\\surai\\eclipse-workspace\\IntroToGit\\TestNGmodule6\\TestNGmodule6.xlsx";
	public final String fileName = "TestData";
	public final String testScenarioSheet = "TestScenario";
	
	public final int runMode = 3;
	public final int status = 2;
	public final String pass = "PASS";
	public final String fail = "FAIL";
	public final String skip = "SKIP";
	
	public final String browserName = ER.ReadValue(filePath, fileName, 1, 4);
	public final String openURL = ER.ReadValue(filePath, fileName, 2, 4);
	public final String userName = ER.ReadValue(filePath, fileName, 4, 4);
	public final String password = ER.ReadValue(filePath, fileName, 5, 4);
	
	public final String emailSignUp = ER.ReadValue(filePath, fileName, 13, 4);
	public final String phoneNum = ER.ReadValue(filePath, fileName, 14, 4);
	
}
