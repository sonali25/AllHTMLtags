package Sample1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class ButtonClick extends TestDiffClass {
	//It will check button click event and redirect to another page.
  @Test
  public void BtnClick() {
	  driver.get("http://www.salesforce.com/in/?ir=1");
	  driver.findElement(By.id("free-trial-trigger")).click();
  }
  

}
