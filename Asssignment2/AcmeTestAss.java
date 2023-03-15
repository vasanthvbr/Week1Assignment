package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class AcmeTestAss {
	public static void main(String[] args) {
		
		EdgeDriver  driver = new EdgeDriver();
		
		driver.get("https://acme-test.uipath.com/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		String expectedResult ="ACME System 1 -  Dashboard";
		String actualResult= driver.getTitle();
		
		if(expectedResult .equals(actualResult));
		System.out.println("Print=" +expectedResult);
		
		driver.findElement(By.linkText("Log Out")).click();
		
		driver.close();
	}
}
