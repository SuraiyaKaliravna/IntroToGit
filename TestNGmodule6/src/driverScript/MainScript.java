package driverScript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import constantValues.TestData;
import testCases.TC001;
import testCases.TC002;
import testCases.TC003;
import testCases.TC004;
import testCases.TC005;
import uitility.ExcelReadWrite;

public class MainScript {

	public static boolean bValue;
	
	
		ExcelReadWrite ER = new ExcelReadWrite();
		TestData TD = new TestData();

//--------------------------------------------tc02--------------------------------------------------
		@Test(priority=1)
		public void tc02() throws Exception {
			TC002 tc02 = new TC002();
			if(ER.ReadValue(TD.filePath, TD.testScenarioSheet, 1, TD.runMode).equalsIgnoreCase("Y")) {
			bValue = true;
			tc02.tc02();
			if(bValue==true) {
				ER.WriteValues(TD.filePath, TD.testScenarioSheet, 1, TD.status, TD.pass);
			}else if(bValue == false) {
				ER.WriteValues(TD.filePath, TD.testScenarioSheet, 1, TD.status, TD.fail);
				assertTrue(false);
			}
		}else {
			ER.WriteValues(TD.filePath, TD.testScenarioSheet, 1, TD.status, TD.skip);
		}
		}	
//-------------------------------------------tc01---------------------------------------------------
		@Test(priority=2)
		public void tc01() throws Exception {
			TC001 tc01 = new TC001();
		if(ER.ReadValue(TD.filePath, TD.testScenarioSheet, 2, TD.runMode).equalsIgnoreCase("Y")) {
			bValue = true;
			tc01.tc01();
			if(bValue==true) {
				ER.WriteValues(TD.filePath, TD.testScenarioSheet, 2, TD.status, TD.pass);
			}else if(bValue == false) {
				ER.WriteValues(TD.filePath, TD.testScenarioSheet, 2, TD.status, TD.fail);
				assertTrue(false);
			}
		}else {
			ER.WriteValues(TD.filePath, TD.testScenarioSheet, 2, TD.status, TD.skip);
		}
		}	
//-------------------------------------------tc03--------------------------------------------------
		@Test(priority=3)
		public void tc03() throws Exception {
			TC003 tc03 = new TC003();
			if(ER.ReadValue(TD.filePath, TD.testScenarioSheet, 3, TD.runMode).equalsIgnoreCase("Y")) {
			bValue = true;
			tc03.tc03();
			if(bValue==true) {
				ER.WriteValues(TD.filePath, TD.testScenarioSheet, 3, TD.status, TD.pass);
			}else if(bValue == false) {
				ER.WriteValues(TD.filePath, TD.testScenarioSheet, 3, TD.status, TD.fail);
				assertTrue(false);
			}
		}else {
			ER.WriteValues(TD.filePath, TD.testScenarioSheet, 3, TD.status, TD.skip);
		}
		}
//-------------------------------------------tc04--------------------------------------------------
		@Test(priority=4)
		public void tc04() throws Exception {
			TC004 tc04 = new TC004();
			if(ER.ReadValue(TD.filePath, TD.testScenarioSheet, 4, TD.runMode).equalsIgnoreCase("Y")) {
			bValue = true;
			tc04.tc04();
			if(bValue==true) {
				ER.WriteValues(TD.filePath, TD.testScenarioSheet, 4, TD.status, TD.pass);
			}else if(bValue == false) {
				ER.WriteValues(TD.filePath, TD.testScenarioSheet, 4, TD.status, TD.fail);
				assertTrue(false);
			}
		}else {
			ER.WriteValues(TD.filePath, TD.testScenarioSheet, 4, TD.status, TD.skip);
		}
		}
//-------------------------------------------tc05--------------------------------------------------
		@Test(priority=5)
		public void tc05() throws Exception {
			TC005 tc05 = new TC005();
			if(ER.ReadValue(TD.filePath, TD.testScenarioSheet, 5, TD.runMode).equalsIgnoreCase("Y")) {
			bValue = true;
			tc05.tc05();
			if(bValue==true) {
				ER.WriteValues(TD.filePath, TD.testScenarioSheet, 5, TD.status, TD.pass);
			}else if(bValue == false) {
				ER.WriteValues(TD.filePath, TD.testScenarioSheet, 5, TD.status, TD.fail);
				assertTrue(false);
			}
		}else {
			ER.WriteValues(TD.filePath, TD.testScenarioSheet, 5, TD.status, TD.skip);
		}
		}
//-------------------------------------------------------------------------------------------------
		
	}


