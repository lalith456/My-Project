package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Book {
	
	public WebDriver dr;
	
	
	By Add=By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/div/ul/li/a[2]");
	
	By Basket=By.xpath("//*[@id=\'text-22-sub_row_1-0-2-1-0\']/div/ul/li/a[3]");
	
	By Quantity=By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/form/table/tbody/tr[1]/td[5]/div/input");
	
	By Update=By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/form/table/tbody/tr[2]/td/input[1]");
			
	By SubTotal=By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div/table/tbody/tr[1]/td/span");
	
	 public void driver()
     {
    	 System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Drivers\\chromedriver.exe");
    	  dr=new ChromeDriver();
    	dr.manage().window().maximize();
    	dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	}
     
     public void url()
     {
    	dr.get("http://practice.automationtesting.in/"); 
     }
	
     
     public void select_book()
     {
    	 dr.findElement(Add).click();
    	 dr.findElement(Basket).click();
     }
     
     public void select_quantity()
	{
		dr.findElement(Quantity).clear();
		dr.findElement(Quantity).sendKeys("2");
	}
	
	public void update_total()
	{
		dr.findElement(Update).click();
	}
	
	public String total()
	{
		String tot=dr.findElement(SubTotal).getText();
		return tot;
	}
	
	public void quit()
	{
		dr.close();
	}

}
