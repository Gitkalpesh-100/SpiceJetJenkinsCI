package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportClass {
	public static ExtentReports getReport() {

		String path = "./Reports/report.html";

		ExtentSparkReporter reporter = new ExtentSparkReporter(path);

		reporter.config().setReportName("TestCase Reporter");

		reporter.config().setDocumentTitle("TestCase Reporter title");

		ExtentReports extent = new ExtentReports();

		extent.attachReporter(reporter);

		return extent;

	}

}
