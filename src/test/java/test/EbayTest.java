package test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import base.EbayBase;
import page.EbayPage;

public class EbayTest extends EbayBase {
	
	@Test
	public void verifyLoginWithValidCred() {
		EbayPage pl = new EbayPage(driver);
		
//		pl.clickContinueBtn();
//		pl.clickContinueBtn();
//		pl.clickSkip();
		
		pl.searchText("fashion");
		pl.clickSrchBtn();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		pl.clickImg();
		
//		driver.navigate().back();
	}
	
	

}
