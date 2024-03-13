package Report_Tool;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_Report {
	@Test
	public void test1() {
		ExtentReports report = new ExtentReports("./reports/r.html", false);
		ExtentTest test = report.startTest("testCase1");
		test.log(LogStatus.PASS, "tc_Pass");
		test.log(LogStatus.FAIL, "tc Failed");
		test.log(LogStatus.SKIP, "tc skipped");
		report.endTest(test);
		report.flush();
	}
}
