package pages;

import wrappers.AppSpecificWrapper;

public class HomePage extends AppSpecificWrapper {

	public HomePage fetchParName() throws InterruptedException {
		Thread.sleep(5000);
		if (verifyText(getWebElement("xpath", "//label[text()=' PARTICIPANT NAME ']/preceding-sibling::label"), "Gopi"))
			reportStep("The Element Gopi verified Successfully", "PASS");
		else
			reportStep("The Element not returns the text", "FAIL");
		return this;
	}

}
