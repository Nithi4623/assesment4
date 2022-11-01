package Nithi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class automatingFacebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("nithi");
		driver.findElement(By.name("lastname")).sendKeys("s");
		driver.findElement(By.name("reg_email__")).sendKeys("9384338923");
		driver.findElement(By.id("password_step_input")).sendKeys("cherry@123");
		WebElement findElement = driver.findElement(By.id("day"));
		Select ele=new Select(findElement);
		ele.selectByValue("1");
		WebElement findElement2 = driver.findElement(By.name("birthday_month"));
		Select iris=new Select(findElement2);
		iris.selectByValue("3");
		WebElement findElement3 = driver.findElement(By.name("birthday_year"));
		 Select reti=new Select(findElement3);
		 reti.selectByValue("2013");
		 driver.findElement(By.name("sex")).click();
		 driver.findElement(By.name("websubmit")).click();
		
		
		
		
		// TODO Auto-generated method stub

	}

}
