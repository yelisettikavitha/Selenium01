package firstpack;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners2 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Susccess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
	System.out.println("Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	System.out.println("Skipped");
	}

	@Override
	public void onFinish(ITestContext context) {
	System.out.println("Ended");
	}

}
