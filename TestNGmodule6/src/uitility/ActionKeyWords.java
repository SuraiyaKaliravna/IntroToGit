package uitility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

//import Uitility.LocatorSplitFunction;
import constantValues.TestData;

public class ActionKeyWords {

	TestData TD = new TestData();
	public static  WebDriver driver;
	public static boolean bValue;
	
	public WebDriver browserName(String bName) {
		if(bName.equalsIgnoreCase("CHROME")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}else if(bName.equalsIgnoreCase("FIREFOX")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		return driver;
	}
	
	public void openURL(String testData) {
		driver.get(TD.openURL);
		Reporter.log("The URL is opened"+ testData);
	}
	
	public void handlingClick(String locVariable) {
		WebElement element = driver.findElement(LocatorSplitFunction.locatorSplit(locVariable));
		element.click();
		Reporter.log("The Element is clicked at Locator: "+ locVariable );
	}
	
	public void handlingTextBox(String locVariable, String testData) {
		WebElement element = driver.findElement(LocatorSplitFunction.locatorSplit(locVariable));
		element.sendKeys(testData);
		Reporter.log("Entered the value at Locator: "+ locVariable );
	}
	
	public void handlingKeyboardKey(String locVariable, Keys backspace) {
		WebElement element = driver.findElement(LocatorSplitFunction.locatorSplit(locVariable));
		element.sendKeys(backspace);
		Reporter.log("Key board Keys used at Locator: "+ locVariable );
	}
	
	public void handlingDropdown(String locVariable, String testData) {
		WebElement element = driver.findElement(LocatorSplitFunction.locatorSplit(locVariable));
		Select sel = new Select(element);
		sel.selectByVisibleText(testData);
		Reporter.log("Value is selected from dropdown list at Locator: "+ locVariable );
	}
	
	public void mouseHoveringWithoutClick(String locVariable) {
		WebElement element = driver.findElement(LocatorSplitFunction.locatorSplit(locVariable));
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		Reporter.log("Element is hovered at Locator: "+ locVariable );
		
	}
	
	public void mouseHoveringWithClick(String locVariable) {
		WebElement element = driver.findElement(LocatorSplitFunction.locatorSplit(locVariable));
		Actions act = new Actions(driver);
		act.moveToElement(element).click().build().perform();
		Reporter.log("Element is hovered and clicked at Locator: "+ locVariable );
	}
	
	public void switchWindows(int windowID) {
		List<String> allWindow = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allWindow.get(windowID));
		Reporter.log("window is switched to windowID: "+ windowID );
	}
	
	public void switchFrame(String testData) {
		driver.switchTo().frame(testData);	
		Reporter.log("Frame is switched to frame: "+ testData );
	}
	
	public void switchToDefault() {
		driver.switchTo().defaultContent();
		Reporter.log("Switched to default content" );
	}
	
	public void handlingTables(String locVariable, String testData) {
		List<WebElement> totalRows = driver.findElements(LocatorSplitFunction.locatorSplit(locVariable));
		int count = totalRows.size();
				
		for(int i=0; i<count; i++) {
			if(bValue==true) {
				break;
			}else {
			
			List<WebElement> totalData = driver.findElements(By.tagName("td"));
			int tdCount = totalData.size();
			
			for(int j=0; j<tdCount; j++) {
				String tdText = totalData.get(j).getText();
				
				if(tdText.equalsIgnoreCase(testData)) {
					totalData.get(j).click();
					bValue=true;
					break;
				}
			}
		}
		}
		Reporter.log("Value is selected from table at locator: "+ locVariable );
	}
	
	public void fetchMultipleValues(String locVariable) {
		List<WebElement> allValues = driver.findElements(LocatorSplitFunction.locatorSplit(locVariable));
		int count = allValues.size();
		for(int i=0; i<count; i++) {
			String allValueText = allValues.get(i).getText();
			System.out.println(allValueText);
		}
		Reporter.log("Multiple values are fetched at Locator: "+ locVariable );
	}
	
	public void scrolling() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scroll(0, 1300)");
		Reporter.log("Window is scrolled " );
	}
	
	public String FetchingValue(String locVariable) {
		WebElement element = driver.findElement(LocatorSplitFunction.locatorSplit(locVariable));
		String value = element.getText();
		System.out.println(value);
		Reporter.log("Signle value is fetched at Locator: "+ locVariable );
		return value;
	}
	
	public void CloseBrowser() {
		driver.close();
		Reporter.log("Browser is closed" );
	}
}
