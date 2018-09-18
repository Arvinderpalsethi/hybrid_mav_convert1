package testcases;

import org.testng.annotations.Test;

import utilities.excelreader;
import utilities.objreader;
import webactivity.webaction;

import org.testng.annotations.DataProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class auth {
	
	WebDriver drv = null;
  @Test//(dataProvider = "dp")
  public void erp_01() 
  {
	 String data [][] = excelreader.excelread("ERP_01");
	  WebElement el = webaction.getelement(drv, data [0][2], objreader.readobj().getProperty("uid"));
	  WebElement el1 = webaction.getelement(drv, data [0][2], objreader.readobj().getProperty("upwd"));
	  WebElement el3 = webaction.getelement(drv, data [2][2], objreader.readobj().getProperty("btn"));
	  
	  System.out.println(objreader.readobj().getProperty("uid"));
	System.out.println("by id/name/xpath : "+data[0][2]);
	  webaction.performaction(el, data[0][3], data [0][4]);
	  webaction.performaction(el1, data[1][3], data [1][4]);
	 webaction.performaction(el3, data [2][3], objreader.readobj().getProperty("btn"));
			  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  
	  drv = new ChromeDriver();
	  drv.get(objreader.readobj().getProperty("url"));
	  
	  
  }

}
