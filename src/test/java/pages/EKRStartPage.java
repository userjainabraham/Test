package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ExcelUtils;

public class EKRStartPage {
	WebDriver driver =null;

	By persons_living = By.xpath("//button[@id='plus']");
	By zip_code=By.xpath("//input[@id='zip']");
	By weiter_button = By.xpath("//button[@id='compareproductslink']");
	By acccept_cookies = By.xpath("//button[@id='onetrust-accept-btn-handler']");

	String projectPath= System.getProperty("user.dir");
	ExcelUtils excel = new ExcelUtils(projectPath+"/Excel/data.xlsx", "Sheet1");
	public EKRStartPage(WebDriver driver) {
		this.driver=driver;
	}
	public void acceptCookies() {

		driver.findElement(acccept_cookies).click();
	}
	public void setNoOfPersons() {
		driver.findElement(persons_living).click();

	}
	public void setZip() {
		driver.findElement(zip_code).sendKeys(String.valueOf(excel.getNumericCellData(2, 0)));
	}

	public void goWeiter() {
		driver.findElement(weiter_button).click();
	}

}

