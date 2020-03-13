package org.tr;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.tsc.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "org.tsc", plugin = { "html:src\\test\\resources\\Reports",
		"json:src\\test\\resources\\Reports\\out.json", "junit:src\\test\\resources\\Reports\\cucumber.xml" },monochrome=true)
public class TestRunner {

	@AfterClass
	public static void reportGeneration() {

		JVMReport.generateJvmReport("src\\test\\resources\\Reports\\out.json");

	}

}
