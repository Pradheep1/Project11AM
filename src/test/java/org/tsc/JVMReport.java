package org.tsc;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void generateJvmReport(String json) {

		File f = new File("F:\\Addcatin\\src\\test\\resources\\Reports\\Repos");

		Configuration c = new Configuration(f, "Adactin login page");
		c.addClassifications("Platform name", "windows");
		c.addClassifications("Browser name", "Chrome");
		c.addClassifications("Browser version", "80.0");
		c.addClassifications("Sprint", "18");

		List<String> jsonFiles = new ArrayList<>();
		jsonFiles.add(json);
		ReportBuilder r = new ReportBuilder(jsonFiles, c);
		r.generateReports();
	}

}
