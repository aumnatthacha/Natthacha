
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import junit.framework.Assert;

class Natthacha {

	@Test
	void Natthacha() throws InterruptedException {
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/demo-site/"); //ลิงค์เว็บ
		
		driver.findElement(By.id("vfb-5")).sendKeys("Natthacha");
		driver.findElement(By.id("vfb-7")).sendKeys("Mumdaeng");
		
		driver.findElement(By.id("vfb-31-2")).sendKeys("Female");
		
		driver.findElement(By.id("vfb-13-address")).sendKeys("มาลัยแมน");
		driver.findElement(By.id("vfb-13-address-2")).sendKeys("115");
		driver.findElement(By.id("vfb-13-city")).sendKeys("วังตะกู");
		driver.findElement(By.id("vfb-13-state")).sendKeys("นครปฐม");
		driver.findElement(By.id("vfb-13-zip")).sendKeys("73000");
		//driver.findElement(By.id("select2-vfb-13-country-container")).click();
		
		driver.findElement(By.id("vfb-14")).sendKeys("644259007@webmail.npru.ac.th");
		driver.findElement(By.id("vfb-18")).sendKeys("02/08/2023");
		
		driver.findElement(By.id("vfb-19")).sendKeys("0656375524");
		
		driver.findElement(By.id("vfb-20-0")).click();
		driver.findElement(By.id("vfb-20-1")).click();
		driver.findElement(By.id("vfb-20-2")).click();
		driver.findElement(By.id("vfb-20-3")).click();
		driver.findElement(By.id("vfb-20-4")).click();
		driver.findElement(By.id("vfb-20-5")).click();
		
		
		driver.findElement(By.id("vfb-23")).sendKeys("ไม่มี");
		driver.findElement(By.id("vfb-3")).sendKeys("99");

		driver.findElement(By.id("vfb-4")).click();
		
	
		String result = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/div/div/div/div/div/div/h2")).getText();
		assertEquals("Dynamic Transaction Verification",result);
		
		String title = driver.getTitle();
		System.out.print(title);
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}