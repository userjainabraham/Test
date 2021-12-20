package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class KontaktDatenPage {
	WebDriver driver = null;
	By vorname_txtbx=By.xpath("//input[@id='firstname']");
	By lastname_txtbx=By.xpath("//input[@id='lastname']");
	By birthday_txtbx=By.xpath("//input[@id='birthday']");
	By telephone_txtbx=By.xpath("//input[@id='telephonenumber']");
	By email_txtbx= By.xpath("//input[@id='email']");
	By email_re_txtbx=By.xpath("//input[@id='emailrepeat']");
	By weiter_btn= By.xpath("//button[@id='next']");
	
	public void anredeDrp(){
		Select drpAnrede = new Select(driver.findElement(By.xpath("//select[@id='gender']")));
		drpAnrede.selectByValue("Herr");
	}

	public void vornameTxtBx() {
		driver.findElement(vorname_txtbx).sendKeys("John");
	}
	public void lastnameTxtBx() {
		driver.findElement(lastname_txtbx).sendKeys("Cena");
	}
	public void birthdayTxtBx() {
		driver.findElement(birthday_txtbx).sendKeys("1.12.2000");
	}
	public void telephoneTxtBx() {
		driver.findElement(telephone_txtbx).sendKeys("+4366564836484");
	}
	public void emailTxtBx() {
		driver.findElement(email_txtbx).sendKeys("johncena@gmail.com");
	}
	public void repeatEmailTxtBx() {
		driver.findElement(email_re_txtbx).sendKeys("johncena@gmail.com");
	}
	public void clickWeiter() {
		driver.findElement(weiter_btn).click();
	}
}
