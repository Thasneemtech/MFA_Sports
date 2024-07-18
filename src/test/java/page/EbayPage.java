package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayPage {
	WebDriver driver;
	
//	@FindBy(xpath = "//*[@id=\"gh-ug\"]/a")
//	WebElement signinBtn;
//	
//	@FindBy(xpath = "//*[@id=\"signin_ggl_btn\"]")
//	WebElement continueBtn;
//	
//	@FindBy(xpath = "//*[@id=\"passkeys-cancel-btn\"]")
//	WebElement skipLink;
	
	@FindBy(xpath = "//input[@id='gh-ac']")
	WebElement searchField;
	
	@FindBy(xpath = "//input[@id='gh-btn']")
	WebElement srchBtn;
	
	@FindBy(xpath = "//body/div[5]/div[4]/div[3]/div[1]/div[3]/ul[1]/li[3]/div[1]/div[1]/div[1]/a[1]/div[1]/img[1]")
	WebElement locateImg;
	
	
	
	public EbayPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	public void clickSigninBtn() {
//		signinBtn.click();
//	}
//	
//	public void clickContinueBtn() {
//		continueBtn.click();
//	}
//	
//	public void clickSkip() {
//		skipLink.click();
//	}
	
	public void searchText(String val) {
		searchField.sendKeys(val);
	}
	
	public void clickSrchBtn() {
		srchBtn.click();
	}
	
	public void clickImg() {
		locateImg.click();
	}

}
