package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import utils.DataInputProvider;

public class AppSpecificWrapper extends GenericWrappers {

	public String dataSheetName;

	@BeforeSuite
	public void beforeSuite() {
		startResult();
	}

	@BeforeClass
	public void bc() {
		startTestModule(testCaseName, testDescription);
	}

	@BeforeMethod
	public void beforeMethod() {
		startTestCase(testNodes);
		launchAndroidApp("Gopi Phone", "com.testleaf.leaforg", "com.testleaf.leaforg.MainActivity", "", "");
		switchWebview();
	}

	@AfterMethod
	public void afterMethod() {
		closeApp();
	}

	@AfterSuite
	public void afterSuite() {
		endResult();
	}

	@DataProvider(name = "fetchData")
	public Object[][] getData() {
		return DataInputProvider.getSheet(dataSheetName);
	}

}
