package org.book;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gecko {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("hollo"+Keys.ENTER);
		
	}

}
