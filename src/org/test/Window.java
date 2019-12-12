package org.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","G:\\eclipse\\WindowHandling\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
driver.get("https://www.snapdeal.com/");
WebElement search = driver.findElement(By.id("inputValEnter"));
search.sendKeys("iphone 11 mobiles");
WebElement btn = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
btn.click();
WebElement casee = driver.findElement(By.xpath("//p[text()='Apple iPhone 11 Bumper Cases Dee Brand - Transparent']"));
casee.click();
String parent = driver.getWindowHandle();
System.out.println(parent);

Set<String> allid = driver.getWindowHandles();
List<String> li=new LinkedList<>();
li.addAll(allid);

String f = li.get(1);
driver.switchTo().window(f);
WebElement tc = driver.findElement(By.xpath("//a[@href='https://www.snapdeal.com/offers/pnb-tnc']"));
tc.click();

Set<String> all = driver.getWindowHandles();
List<String> li1=new LinkedList<>();
li.addAll(all);

String s = li1.get(2);
driver.switchTo().window(s);



}
}
