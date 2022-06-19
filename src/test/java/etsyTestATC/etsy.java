package etsyTestATC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class etsy {

	public static void main(String[] args) throws InterruptedException {

		
		System.out.println("Inititalizing MAC Terminal Test For Etsy Page Testing");
											//~~//
		
		System.setProperty("webDriver.chrome.driver", "chromedriver");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.etsy.com/");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		WebElement under50 = driver.findElement(By.xpath("//span[@id=\"catnav-primary-link-891\"]"));
		actions.moveToElement(under50).build().perform();
		Thread.sleep(3000);
		WebElement officeSubMenu= driver.findElement(By.xpath("//a[@id=\"catnav-l3-10975\"]"));
		officeSubMenu.click();
		WebElement gift = driver.findElement(By.xpath("//*[text()[contains(.,'Teacher')]]"));
		actions.moveToElement(gift);
		Thread.sleep(2000);
		gift.click();
		Thread.sleep(3000);
		WebElement sizeSelect = driver.findElement(By.xpath("//select[@id='variation-selector-0']"));
		Thread.sleep(3000);
		sizeSelect.click();
		WebElement size = driver.findElement(By.xpath("//option[value=\"808393226\""));
		size.click();
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
		
		
		
		
	}

}
