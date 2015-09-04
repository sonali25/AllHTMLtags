package Sample1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class RadioButton extends TestDiffClass {
	//It will just tick in square box.
  @Test
  public void f() {
	  driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales-pe.jsp?d=70130000000tT6v&internal=true");
	  driver.findElement(By.id("SubscriptionAgreement")).click();
	  
  }
  

}
