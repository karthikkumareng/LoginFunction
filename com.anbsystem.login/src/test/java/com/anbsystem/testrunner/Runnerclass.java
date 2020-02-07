package com.anbsystem.testrunner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\AnbSytem\\com.anbsystem.login\\src\\resource\\java\\Features\\loginfunctionality.feature", 
		glue = "com.anbsystem.stepdefitions", plugin = { "pretty", "html:target/cucumber-reports/cucumber-pretty", "json:target/cucumber-reports/CucumberTestReport.json",
				 "rerun:target/cucumber-reports/rerun.txt" }, 
		monochrome = true, 																	
		strict = true, 
		dryRun = false,
		tags = {"@tag1","@tag2","@tag3","@tag4","@tag5","@tag6","@tag7"}
		)

public class Runnerclass {

}
