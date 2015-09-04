package Sample1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;


public class TestDiffClass {
	public static WebDriver driver=null;
	String baseUrl="https://www.salesforce.com/in/form/signup/freetrial-sales-pe.jsp?d=70130000000tT6v&internal=true";
	static boolean check=false;
	
	
	TestDiffClass(){
		if(check==false){
			startDriver();
		}
		
	}

    public void startDriver() {
    		check=true;
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
           // driver.get("http://www.salesforce.com/in/?ir=1");	
    }
  

  @AfterMethod
  public void getResult(ITestResult result) throws InterruptedException {
      //System.out.println(System.lineSeparator() + "Method Name: " + result.getMethod().getMethodName());
      System.out.println("Sucess Status: " + result.isSuccess());
      //if (!result.isSuccess()) {
          //TestUtil.takeScreenShot(result.getMethod().getMethodName());
          //quitDriver();
          //getDriver();
          //login();
      //}
  }
   @AfterSuite
   public void CloseWindow(){
	   
	   driver.quit();
   }

}
