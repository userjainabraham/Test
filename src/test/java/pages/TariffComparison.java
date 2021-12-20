package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TariffComparison {
	WebDriver driver =null;


	By chkbox1_vergleichen =By.xpath("//body/div[1]/div[2]/div[1]/div[2]/div/div[2]/main/div/div[2]/div[2]/div[2]/div[1]/div/div[1]/div/div[1]/div[2]/div/span/label/span[2]");

	public TariffComparison(WebDriver driver){
		this.driver =driver;
	}

	public void selectChkbox() throws Exception {
		List <WebElement> listOfCheckbox = driver.findElements(By.xpath("//span[@class='checkbox__indicator']"));
		Thread.sleep(1000);
		listOfCheckbox.get(0).click();
	}
	public void selectTarif() throws Exception {
		Thread.sleep(1000);
		driver.findElement(chkbox1_vergleichen).click();
	}
	public void compareTarif() throws Exception{
		Thread.sleep(1000);
		List <WebElement> listOfEON = driver.findElements(By.xpath("button[@id='powercontractlink']"));
		listOfEON.get(0).click();
	}




}
