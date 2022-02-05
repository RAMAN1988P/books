package org.book;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Books\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/");
		WebElement find = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a"));
		find.click();
		
		driver.findElement(By.id("email")).sendKeys("ramakila1988@gmail.com");
		
		WebElement Appenbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		Appenbox.sendKeys("Welcome");
		
		String dis = driver.findElement(By.name("username")).getAttribute("value");
		System.out.println(dis);
		
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input")).clear();
		
		boolean bool = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input")).isEnabled();
		System.out.println(bool);
		
	}
	
}
