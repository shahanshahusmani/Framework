package Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Listener1 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Execution started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TC passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TC Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TC Skipped");
	}
	

}
