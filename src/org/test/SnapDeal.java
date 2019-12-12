package org.test;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "G:\\eclipse\\WindowHandling\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	WebElement search = driver.findElement(By.id("inputValEnter"));
	search.sendKeys("iphone");
	WebElement click = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
	click.click();
	WebElement iphone = driver.findElement(By.xpath("//img[@title='Apple iPhone 7 ( 32GB , 2 GB ) Black']"));
	iphone.click();
	
	String parent = driver.getWindowHandle();
	
	Set<String> all = driver.getWindowHandles();
	
	for (String x : all) {
		if (!parent.equals(all))
		{
		driver.switchTo().window(x);
	}
	}
	WebElement tc = driver.findElement(By.id("(//a[@target='_blank'])[3]"));
	tc.click();
	
	Set<String> all1 = driver.getWindowHandles();
	List<String> li=new ArrayList<>();
	
	li.addAll(all1);
	String s = li.get(2);
	driver.switchTo().window(s);
	
	WebElement text = driver.findElement(By.xpath("//div[text()='Terms & Conditions ']"));
	text.getText(); 	
}
}
