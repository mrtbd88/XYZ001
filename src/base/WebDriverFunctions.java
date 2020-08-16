package base;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class WebDriverFunctions {
	
	
WebDriver driver;
	
	public void getCurrentTime() {
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");  
		Date date = new Date();  
		System.out.println(formatter.format(date)); 
		System.out.println (" my test suite started at this time --> " +formatter.format(date));
	}
	public void typeByXpath(String loc, String val){
		driver.findElement(By.xpath(loc)).sendKeys(val);
	}
	public void typeById(String loc, String val){
		driver.findElement(By.id(loc)).sendKeys(val);
	}
	public void typeByCss(String loc, String val){
		driver.findElement(By.cssSelector(loc)).clear();
		driver.findElement(By.cssSelector(loc)).sendKeys(val);
	}
	public void typeByName(String loc, String val){
		driver.findElement(By.name(loc)).sendKeys(val);
	}
	
	public void clickByXpath (String loc){
		driver.findElement(By.xpath(loc)).click();
	}
	public void clickByCss (String loc){
		driver.findElement(By.cssSelector(loc)).click();
	}
	public void clickById (String loc){
		driver.findElement(By.id(loc)).click();
	}
	public void clickByName (String loc){
		driver.findElement(By.name(loc)).click();
	}
	
	public void assertEqualByXpath (String loc, String expValue){
		String act = driver.findElement(By.xpath(loc)).getText(); 
		// act is coming from Domain -- the one developer build and release
		String exp = expValue; // exp is coming from Requirement or Mock-up
		Assert.assertEquals(act, exp);
	}
	 public void DateAddHour () {
	        Calendar calendar = Calendar.getInstance();
	        System.out.println("Original = " + calendar.getTime());
	 
	        // Substract 2 hour from the current time
	        calendar.add(Calendar.HOUR, -2);
	 
	        // Add 30 minutes to the calendar time
	        calendar.add(Calendar.MINUTE, 30);
	 
	        // Add 300 seconds to the calendar time
	        calendar.add(Calendar.SECOND, 300);
	        System.out.println("Updated  = " + calendar.getTime());
	}
	 public void comparedateTime() {
		    Calendar futureCal = Calendar.getInstance();
		    futureCal.set(Calendar.YEAR, 3000);
		    Calendar now = Calendar.getInstance();
		    System.out.println("Current date : " + (now.get(Calendar.MONTH) + 1) + "-"
		        + now.get(Calendar.DATE) + "-" + now.get(Calendar.YEAR));

		    System.out.println("Is futureCal after now ? : " + futureCal.after(now));
	 }
}



