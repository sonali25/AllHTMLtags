package Sample1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;


public class TextBox extends TestDiffClass{
	
	//Here some data is entered into the empty text box.
  @Test
  public void TxtBox() {
	  
	  //System.out.println("Text Box");
	  driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales-pe.jsp?d=70130000000tT6v&internal=true");
	  driver.findElement(By.id("UserFirstName")).sendKeys("NAME");
	  driver.findElement(By.id("UserLastName")).sendKeys("LAST NAME");
	
	  
  }
  

  

}
