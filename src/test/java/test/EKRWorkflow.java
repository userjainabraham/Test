package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.EKRStartPage;
import pages.TariffComparison;

public class EKRWorkflow {
	static WebDriver driver=null;

	@BeforeTest
	public void setUpTest() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://energiekostenrechner.post.at/#/");
	}
	@Test(priority=0)
	public static void startPage() throws Exception   {

		EKRStartPage startPageObj =new EKRStartPage(driver);
		Thread.sleep(1000);
		startPageObj.acceptCookies();
		startPageObj.setNoOfPersons();
		startPageObj.setZip();
		Thread.sleep(1000);
		startPageObj.goWeiter();

	}
	@Test(priority=1)
	public static void secondPage() throws Exception {
		TariffComparison trfCompObj=new TariffComparison(driver);
	
		trfCompObj.selectChkbox();
		trfCompObj.selectTarif();
		trfCompObj.compareTarif();
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
