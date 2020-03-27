package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
	
	 public WebDriver dr;
		
		By myaccount=By.xpath("/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a");
		
		
		By user=By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[2]/form/p[1]/input");

		
		By pwd=By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[2]/form/p[2]/input");
		
		
		By button=By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[2]/form/p[3]/input[3]");
		


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
	      
	     public void myacc()
	     {
	    dr.findElement(myaccount).click();
	     }
	     public void details()
	     {
	    	 dr.findElement(user).sendKeys("lalith7862@gmail.com");
	    	 dr.findElement(pwd).sendKeys("lalith123");
	    	 dr.findElement(button).click();
	    	
	     }
	     
	     public void quit()
	     {
	    	 dr.close();
	     }
	     
		
	}



