package com.qa.TestScripts;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\dasarikr\\Downloads\\SeleniumAssignments-master\\src\\test\\java\\com\\qa\\Features\\OrangeHRM.Feature",
		glue="com.qa.StepDefinitions",
		dryRun=false, // dryRun should be false to open the chrome
		strict=true, //strict should be true to open the chrome
		monochrome=true,
		format= {"pretty", "html:test-output"},
		tags= {"@SmokeTest"}
		)

public class TC16_18_Cucumber {

}
