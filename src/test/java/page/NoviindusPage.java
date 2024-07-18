package page;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoviindusPage {
	WebDriver driver;
	
	@FindBy(xpath = "//header/div[2]/div[1]/div[1]/div[3]/div[1]/div[3]")
	WebElement account;
	
	@FindBy(id = "mobile_number")
	WebElement mobileno;
	
	@FindBy(xpath = "//input[@id='login_password']")
	WebElement passfield;
	
	@FindBy(xpath = "//button[@id='loginbtn']")
	WebElement loginBtn;
	
	@FindBy(id = "searchInput")
	WebElement srchField;
	
	@FindBy(xpath = "//*[@id=\"searchbtn-prod\"]")
	WebElement searchIcon;
	
	@FindBy(xpath = "//body/section[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/a[1]")
	WebElement shorts;
	
	@FindBy(xpath = "//*[@id=\"data_table\"]/div[4]/div/a")
	WebElement pinkShort;
	
	@FindBy(xpath = "//a[contains(text(),'About Us')]")
	WebElement aboutUs;
	
	@FindBy(id = "navbarDropdown")
	WebElement products;
	
	@FindBy(xpath = "//a[contains(text(),'IMPORTED KITS')]")
	WebElement kits;
	
	@FindBy(xpath = "//a[contains(text(),'Blogs')]")
	WebElement blogs;
	
	@FindBy(xpath = "//a[contains(text(),'Contact Us')]")
	WebElement contact;
	
	@FindBy(xpath = "//header/div[3]/div[1]/div[2]/div[1]/p[1]/span[1]/a[1]")
	WebElement insta;
	
	@FindBy(xpath = "/html/body/section[1]/div/div[1]/div/a")
	WebElement viewAll;
	
	@FindBy(xpath = "//body/footer[1]/div[1]/div[1]/div[1]/div[1]/img[1]")
	WebElement footer;
	
	@FindBy(xpath = "//p[contains(text(),'Terms & Conditions')]")
	WebElement termsConditn;
	
	@FindBy(xpath = "/html/body/header/div[2]/div/div/div[1]/a/img[1]")
	boolean logo;
	
	@FindBy(tagName = "a")
	List<WebElement>li;
	
	public NoviindusPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickaccount() {
		account.click();
	}
	
	public void setValues(String MN,String PW) {
		mobileno.sendKeys(MN);
		passfield.sendKeys(PW);
	}
	
	public void clickLoginBtn() throws InterruptedException {
		loginBtn.click();
		Thread.sleep(4000);
	}
	
	public void searchField() {
		srchField.click();
	}

	public void searchText(String val) throws InterruptedException {
		srchField.sendKeys(val);
		Thread.sleep(1000);
	}
	public void searchIcon() throws InterruptedException  {
		searchIcon.click();
		Thread.sleep(4000);
	}
	
	public void mouseToPhotoFrames() {
		Actions act = new Actions(driver);
		act.moveToElement(shorts).perform();
	}
	
	public void shortSlct() throws InterruptedException {
		shorts.click();
		Thread.sleep(2000);
	}
	
	public void PinkShortSlct() throws InterruptedException {
		pinkShort.click();
		Thread.sleep(2000);
	}
	
	public void slctAbout() throws InterruptedException {
		aboutUs.click();
		Thread.sleep(3000);
	}
	
	public void productsLink() throws InterruptedException {
		products.click();
		Thread.sleep(4000);
	}
	
	public void mouseToKits() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(kits).perform();
		Thread.sleep(2000);
	}
	
	public void kitsClick() throws InterruptedException {
		kits.click();
		Thread.sleep(2000);
	}
	
	public void blogsClick() throws InterruptedException {
		blogs.click();
		Thread.sleep(4000);
	}
	
	public void contactSlct() throws InterruptedException {
		contact.click();
		Thread.sleep(4000);
	}
	
	public void instaSlct() throws InterruptedException {
		insta.click();
		Thread.sleep(4000);
	}
	
	public void windowHandle() throws InterruptedException {
		String parentWindow = driver.getWindowHandle();
		System.out.println("parentWindow = "+driver.getTitle());
		insta.click();
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		for(String handle : allWindowHandles) {
			if(!handle.equalsIgnoreCase(parentWindow)) {
				driver.switchTo().window(handle);
				Thread.sleep(4000);
			}
			driver.switchTo().window(parentWindow);
		}
		
		driver.switchTo().window(parentWindow);
	}
	
	public void slctAll() {
		viewAll.click();
	}
	
	public void pageSource() {
		String src = driver.getPageSource();
		
		if(src.contains("OFFER JERSEY")) {
			System.out.println("Text is present");
		}
		else {
			System.out.println("Text is not present");
		}
	}
	
	public void mouseToFooter() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(footer).perform();
		Thread.sleep(2000);
	}
	
	public void slctFooter() {
		footer.click();
	}
	
	public void mouseToTerms() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(termsConditn).perform();
		Thread.sleep(2000);
	}
	
	public void slctTerms() {
		termsConditn.click();
	}
	
    public void logoVerify() {
		
		if(logo) {
			System.out.println("Logo is present");
		}
		else{
			System.out.println("Logo is not present");
		}
	}
    
	public void linksLocate() {
		System.out.println("Total no of links : "+li.size());
		
		for(WebElement data : li) {
			String links = data.getAttribute("href");
			String linkText = data.getText();
			System.out.println(linkText + " \t " + links );

		}
	}
}
