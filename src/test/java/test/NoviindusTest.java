package test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import base.NoviindusBase;
import page.NoviindusPage;

public class NoviindusTest extends NoviindusBase{
	
	@Test
	public void verifyLoginWithValidCred() throws InterruptedException {
		NoviindusPage pl = new NoviindusPage(driver);
		
		pl.clickaccount();		
		pl.setValues("08606295904", "Asif@123");
		pl.clickLoginBtn();
		
		pl.searchField();
		pl.searchText("jersey");
		pl.searchIcon();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		driver.navigate().back();
		driver.navigate().back();
		
		pl.shortSlct();
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,500)");
		
		pl.PinkShortSlct();
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,1500)");
		
		driver.navigate().back();
		driver.navigate().back();
		
		pl.slctAbout();
		
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		pl.productsLink();
		
		pl.kitsClick();
		
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		driver.navigate().back();
		driver.navigate().back();
		
		pl.blogsClick();
		
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		pl.contactSlct();
		
		driver.navigate().back();
		
		pl.instaSlct();
		
		pl.windowHandle();
		
		driver.navigate().back();
		
		pl.slctAll();
		
		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		js6.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		driver.navigate().back();
		
		pl.pageSource();
		
		JavascriptExecutor js7 = (JavascriptExecutor) driver;
		js7.executeScript("window.scrollBy(0,5200)");
		
		pl.mouseToFooter();
		
		pl.slctTerms();
		
		driver.navigate().back();
		
		JavascriptExecutor js8 = (JavascriptExecutor) driver;
		js8.executeScript("window.scrollBy(5200,0)");
		
		pl.logoVerify();
		
		pl.linksLocate();
	}

}
