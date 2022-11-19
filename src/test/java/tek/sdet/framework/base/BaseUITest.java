package tek.sdet.framework.base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import tek.sdet.framework.utilities.CommonUtilities;

public class BaseUITest extends CommonUtilities{
	
	
	@Before
	public void setupTests() {
		super.setupBrowser();
	}
	
	
	@After
	public void closeTests(Scenario scenario) {
		if(scenario.isFailed()) {
			byte[] screenShot = takeScreenShotAsBytes();
			scenario.attach(screenShot, "image/png", scenario.getName() + "Scenario Failed");
		}
		super.quitBrowser();
	}

}
