import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class EnergieKostenRechner  {
	public void test() throws Exception {

			
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		WebDriverManager.chromedriver().setup();
		
		//ChromeOptions options =new ChromeOptions();
		//options.addArguments("--headless");
		
		//WebDriver driver= new ChromeDriver(options);
		
				
		driver.get("https://energiekostenrechner.post.at/#/");
		
			Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		//driver.findElement(By.xpath("//*[contains(text(), 'Gas')]")).click();
		driver.findElement(By.xpath("//button[@id='plus']")).click();
		driver.findElement(By.xpath("//input[@id='zip']")).sendKeys(String.valueOf(1130));
		
			Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='compareproductslink']")).click();
		List <WebElement> listOfCheckbox = driver.findElements(By.xpath("//span[@class='checkbox__indicator']"));
		listOfCheckbox.get(0).click();
		
			Thread.sleep(2000);
		
		driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[2]/div/div[2]/main/div/div[2]/div[2]/div[2]/div[1]/div/div[1]/div/div[1]/div[2]/div/span/label/span[2]")).click();
		List <WebElement> listOfEON = driver.findElements(By.xpath("//button[@id='powercontractlink']"));
		listOfEON.get(0).click();
			
				Thread.sleep(2000);
			
		Select drpAnrede = new Select(driver.findElement(By.xpath("//select[@id='gender']")));
		drpAnrede.selectByValue("Herr");
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Cena");
		driver.findElement(By.xpath("//input[@id='birthday']")).sendKeys("1.12.2000");
		driver.findElement(By.xpath("//input[@id='telephonenumber']")).sendKeys("+4366564836484");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("johncena@gmail.com");
		driver.findElement(By.xpath("//input[@id='emailrepeat']")).sendKeys("johncena@gmail.com");
		
			Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='next']")).click();
		
			Thread.sleep(2000);
		
	
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Wien");
		driver.findElement(By.xpath("//input[@id='street']")).sendKeys("Nussdorfer Strasse");
		driver.findElement(By.xpath("//input[@id='housenumber']")).sendKeys(String.valueOf(16));
		driver.findElement(By.xpath("//input[@id='doornumber']")).sendKeys(String.valueOf(20));
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@id='next']")).click();
		
		driver.findElement(By.xpath("//input[@id='countingpoint1']")).sendKeys("AT5852300098023423431234567890123");
		driver.findElement(By.className("sc-form__checkbox__indicator")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='next']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='accountowner']")).sendKeys("John Cena");
		driver.findElement(By.xpath("//input[@id='iban']")).sendKeys("AT585230009802342343");
		driver.findElement(By.xpath("//input[@id='bic']")).sendKeys("HSEEAT2KXXX");
		Thread.sleep(1000);
		driver.findElement(By.className("sc-form__checkbox__indicator")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='next']")).click();
		Thread.sleep(1000);
		
		List<WebElement> listOfCheckboxes = driver.findElements(By.className("sc-form__checkbox__indicator"));
		listOfCheckboxes.get(0).click();
		listOfCheckboxes.get(1).click();
		//driver.findElement(By.xpath("//button[@id='finishbutton']")).click();




		

		
		
		//driver.close();
		//driver.quit();

}

}
