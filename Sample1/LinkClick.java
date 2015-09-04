package Sample1;



import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class LinkClick extends TestDiffClass {
	//Here it will select the link 
  @Test
  public void f() {
	  driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales-pe.jsp?d=70130000000tT6v&internal=true");
	  driver.findElement(By.xpath(".//*[@id='form-container']/ul/li[20]/div/div[2]/span[2]/a")).click();
	  String TempUrl=driver.getCurrentUrl();
	  driver.get(TempUrl);
	  driver.navigate().to(baseUrl);
  }
  

}
