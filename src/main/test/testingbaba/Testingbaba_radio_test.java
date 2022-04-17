package testingbaba;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;

import pages.Testingbaba_radio_page;
import propertyutility.PropertyUtility;

public class Testingbaba_radio_test extends Baselibrary

{

	Testingbaba_radio_page ob;
	@Parameters({ "browser" })
	@BeforeTest
	public void launchtestingbaba(String browser) 
	{
		String url = PropertyUtility.getreadproperty("Testingbabaurl");
		if(browser.equalsIgnoreCase("firefox")) {
			 
		     //Initializing the firefox driver (Gecko)
			 FirefoxLaunch();

		  }else if (browser.equalsIgnoreCase("chrome")) { 

			  //Initialize the chrome driver

			  ChromeLaunch();

		  } 
		driver.get(url);
		ob = new Testingbaba_radio_page();

	}

	@Test()

	public void RadioButtonTestingBaba_test01() throws Exception

	{
		ob.getradio();
	}

}
