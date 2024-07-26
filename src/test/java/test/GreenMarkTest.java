package test;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import base.GreenMarkBase;
import page.GreenMarkPage;


public class GreenMarkTest extends GreenMarkBase{
	
	@Test
	public void verifyLoginWithValidCred() throws InterruptedException {
		GreenMarkPage pl = new GreenMarkPage(driver);
		
		pl.slctLoginBtn();
		pl.setValues("8129552788", "Greenmark@123");
		pl.clickLogin();
		pl.logoVerify();
		

		pl.searchText("hair serum");
		pl.clickSrchIcon();
		
		JavascriptExecutor js6= (JavascriptExecutor) driver;
		js6.executeScript("window.scrollBy(0,200)");
		
		pl.slctHerbalShamboo();
	
		pl.AddToWishlist();
		
		JavascriptExecutor js7= (JavascriptExecutor) driver;
		js7.executeScript("window.scrollBy(0,100)");
		
		pl.AddShamboToCart();
		
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().refresh();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		
		pl.HerbalBeuty();
	
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,200)");
		
		pl.clickNeem();
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,600)");
		
		driver.navigate().back();

		pl.SlctOrange();
		
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0,300)");
		
		pl.SlctCart();
	
//		pl.DropDwnQty();
		
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollBy(0,300)");
		
		pl.ClickCntinueShopping();
		
		JavascriptExecutor js8 = (JavascriptExecutor) driver;
		js8.executeScript("window.scrollBy(0,1400)");
		
		pl.ClickImage();
		
		pl.ClickClose();
		
		JavascriptExecutor js9 = (JavascriptExecutor) driver;
		js9.executeScript("window.scrollBy(0,1000)");
		
		pl.clickVideo();

		pl.clickVideoClose();
		
		JavascriptExecutor js10 = (JavascriptExecutor) driver;
		js10.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		driver.navigate().refresh();
		
		pl.cartSlct();
		
		driver.navigate().back();
		
		JavascriptExecutor js11 = (JavascriptExecutor) driver;
		js11.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		pl.FooterSlct();
		
		pl.logoPrsnt();
		
		driver.navigate().refresh();
		
		pl.CartLocatee();
		
		pl.LocateClrCart();
		
		driver.navigate().back();
		
		pl.JustDialWindowHandle();
		
		pl.linksLocate();
		
		pl.slctWtsup();
		
		pl.Alert();
	}
}
