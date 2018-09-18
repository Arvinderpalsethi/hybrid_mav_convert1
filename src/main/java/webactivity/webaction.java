package webactivity;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.base.CaseFormat;

public class webaction {

	public static WebElement getelement( WebDriver d, String by,String value) 
	{
		WebElement el = null;
		by = by.toUpperCase();
		
		switch (by) 
		{
		case "ID":
			el = d.findElement(By.id(value));
			break;
			
		case "NAME":
		el= d.findElement(By.name(value));
			break;
			
		case "XPATH":
			el =d.findElement(By.xpath(value));
			//System.out.println("Xpath= "+value);
			
		case "CLASS":
		el= d.findElement(By.className(value));
		
		default:
			break;
		}
		
		return el;

	}
	
	public static void performaction(WebElement el, String by, String value)
	{
		
		by =by.toUpperCase();
		
		switch (by)
		{
		case "SENDKEYS":
		el.sendKeys(value);
		break;
		
		case "CLICK":
		el.click();
		break;
		
		case "CLEAR":
		el.clear();
		break;
		
		}
		
	}

}
