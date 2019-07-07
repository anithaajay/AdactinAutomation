package com.selenium.baseclass;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseclassMaven {

	public static WebDriver driver;
	
	public static WebDriver browserlaunch(String Browsername) {
		
		
		try {
			if (Browsername.equalsIgnoreCase("chrome")) {
				
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resource\\com\\selinium\\drivers\\chromedriver.exe");
				driver=new ChromeDriver();
				
			}
			else {
				
				throw new RuntimeException("please specify a valid browser");
				
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			return driver;
		} catch (Exception e) {
			
			e.printStackTrace();
			throw new RuntimeException();
		}
		
		}
	
	public static void geturl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
			
		}
		
		}
	
	public static boolean elementIsDisplayed(WebElement element) {
		
		
		try {
			//WebElement Element = driver.findElement(By.id(""));
boolean display=element.isDisplayed();
			
return display;
		} catch (Exception e) {
			
			e.printStackTrace();
			throw new RuntimeException();
		}
		
	}
	

	public static boolean elementIsenabled(WebElement element) {
		
	try {
		boolean enabled=element.isEnabled();
			
			return enabled;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		throw new RuntimeException();
	}
		
	}
	
	public static void waitforelementvisibility(WebElement element) {
		
	try {
		WebDriverWait wd=new WebDriverWait(driver,40);
		wd.until(ExpectedConditions.visibilityOf(element));
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		throw new RuntimeException();
		
	}
		

	}
	
public static void waitForTextPresentOnElement(WebElement element,String text) {
	try {
		WebDriverWait wb=new WebDriverWait(driver,40);
		wb.until(ExpectedConditions.textToBePresentInElement(element, text));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		throw new RuntimeException();
		
	}
		
}
	public static void inPutValuesToTheElement(WebElement element,String value) {
		
		try {
			waitforelementvisibility(element);
			boolean elementIsDisplayed = elementIsDisplayed(element);
			boolean elementIsenabled = elementIsenabled(element);
	
		
	
if (elementIsDisplayed&&elementIsenabled) {
			//element.clear();
			element.sendKeys(value);
		
			
}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}	
		
	}
	
public static void clickOnTheElement(WebElement element) {
	try {
		
		
			
	
		waitforelementvisibility(element);
		//boolean elementIsDisplayed = elementIsDisplayed(element);
		if (elementIsDisplayed(element)) {
			element.click();
		
	}

	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		throw new RuntimeException();
	}
	
}
	public static void mouseHoverOnTheElement(WebElement element) {
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			throw new RuntimeException();
		}
		
		
		
	}

	public static void selectfromdropdown(WebElement element,String value,String options) {
		try {
			waitforelementvisibility(element);
			Select sc=new Select(element);
			if (options.equalsIgnoreCase(value)) {
				sc.selectByValue(value);
				
			}
			
			else if (options.equalsIgnoreCase(value)) {
				sc.selectByVisibleText(value);
				
			}
			
			else if (options.equalsIgnoreCase(value)) {
				sc.selectByIndex(Integer.parseInt(value));
				
			}
			
			
			else  {
				throw new RuntimeException();
				
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
		
	}
	
	
	/*public static void mouseHoverClickelement(WebElement element) {
		
		try {
			Actions ac=new Actions(driver);
			ac.click(element).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
		
		
	}*/
		
	public static String getTextofTheElement(WebElement element) {
		String getTextvalue=element.getText();
		System.out.println(getTextvalue);
		return getTextvalue;
	
	}
	public static String getAttributeValue(WebElement element) {
		String getTextvalue=element.getAttribute("value");
		//System.out.println(getTextvalue);
		return getTextvalue;
	
	}

	

}
