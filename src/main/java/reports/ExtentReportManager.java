package reports;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

public static ExtentReports extent;

public static ExtentReports getReport(){

if(extent==null){

ExtentSparkReporter spark = new ExtentSparkReporter("reports/ExtentReport.html");

//This line creates a Spark reporter which generates an HTML report at the specified location.

extent = new ExtentReports();

extent.attachReporter(spark);

}

return extent;

}

}