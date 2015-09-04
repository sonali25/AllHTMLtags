package Sample1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class DropDownList extends TestDiffClass {
	//It will click on list and select any one option from the list.
  @Test
  public void Dropdwn() {
	  driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales-pe.jsp?d=70130000000tT6v&internal=true");
	  driver.findElement(By.xpath(".//*[@id='form-container']/ul/li[10]/div/div[2]/a/span[1]")).click();
	  driver.findElement(By.xpath("html/body/ul[1]/li[6]/a")).click();
  }
  

}
