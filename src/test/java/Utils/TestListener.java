package Utils;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class TestListener implements ITestListener {

    ExtentTest test;

    public void onTestStart(ITestResult result) {
        test = ExtentReport.getReportInstance()
                .createTest(result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        test.pass("Test Passed");
    }

    public void onTestFailure(ITestResult result) {
        test.fail(result.getThrowable());
    }

    public void onFinish(org.testng.ITestContext context) {
        ExtentReport.getReportInstance().flush();
    }
}
