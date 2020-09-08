package com.mrudul;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VoteForMrudul {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sonpari\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://mycutebaby.in/contest/participant/?n=5f549d64d60ed");
		driver.findElement(By.xpath("//input[@id='v']")).sendKeys("Mrudul Groups");
		driver.findElement(By.xpath("//span[@class='text']")).click();
	}

}
