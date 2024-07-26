package page;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class GreenMarkPage {
	WebDriver driver;
	
	@FindBy(xpath = "//span[contains(text(),'Log In')]")
	WebElement loginBtn;
	
	@FindBy(name = "mobile")
	WebElement mobileField;
	
	@FindBy(name = "password")
	WebElement passField;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[13]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/button[1]/div[1]")
	WebElement login;
	
	@FindBy(id = "srchtxtsticky")
	WebElement srchField;
	
	@FindBy(xpath = "//span[contains(text(),'Search')]")
	WebElement srchIcon;
	
	@FindBy(xpath = "//*[@id=\"productdiv\"]/div[3]/a/div/div[3]/div[1]/div/div[1]/div/div")
	WebElement herbalShamboo;
	
	@FindBy(xpath = "//*[@id=\"imgBox\"]/div[2]/span")
	WebElement wishlist;
	
	@FindBy(xpath = "//*[@id=\"add-btns-section\"]/div[1]/div/div/div[1]/button/div")
	WebElement addShambooCart;
	
	@FindBy(xpath = "//div[contains(text(),'Herbal Beauty Products')]")
	WebElement herbalBeauty;
	
	@FindBy(xpath = "//div[contains(text(),'Neem Face Wash 100ml')]")
	WebElement neemFaceWash;
	
	@FindBy(xpath = "//div[contains(text(),'Orange Face Wash 100ml')]")
	WebElement orangeFaceWash;
	
	@FindBy(xpath = "//*[@id=\"add-btns-section\"]/div[1]/div/div/div[1]/button/div")
	WebElement addToCart;
	
//	@FindBy(xpath = "//*[@id=\"btn-2010224311\"]/i")
//	WebElement QtyDrpDwn;

	@FindBy(xpath = "//a[@id='contiueBtnText']")
	WebElement continueShopping;
	
	@FindBy(xpath = "//*[@id=\"contentBlock706514440\"]/div/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div[5]/div/div/img")
	WebElement imageView;
	
	@FindBy(xpath = "//*[@id=\"react-slider-holder\"]/div/div[2]/div[2]/div")
	WebElement close;
	
	@FindBy(xpath = "//*[@id=\"contentBlock706514441\"]/div/div/div/div[2]/div/div/div[1]/div[1]/div/div[1]/span[3]")
	WebElement videoView;
	
	@FindBy(xpath = "//*[@id=\"contentBlock706514441\"]/div/div/div/div[2]/div/div/div[1]/div[1]/div/div[1]/span[3]")
	WebElement closeVideo;
	
	@FindBy(id = "crt-btn-onscroll")
	WebElement cart;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[8]/section/div[1]/div[2]/div/div/div[1]/div/div/ul/li[2]/div/a")
	WebElement footer;
	
	@FindBy(xpath = "//*[@id=\"header-second-block\"]/div/div[1]/div/a/span/img")
	boolean logo;
		
	@FindBy(xpath = "//i[@id='totalitems']")
	WebElement CartLocate;
	
	@FindBy(xpath = "//a[contains(text(),'CLEAR CART')]")
	WebElement clrCart;
	
	@FindBy(xpath = "//*[@id=\"header-first-block\"]/div/div[1]/div[1]/div/i/a")
	WebElement justDial;
	
	@FindBy(tagName = "a")
	List<WebElement>li;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[8]/a/div/img")
	WebElement whatsapp;

	
	public GreenMarkPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void slctLoginBtn() {
		loginBtn.click();
	}
	
	public void setValues(String MN,String PWD) {
		mobileField.sendKeys(MN);
		passField.sendKeys(PWD);
	}
	
	public void clickLogin() throws InterruptedException {
		login.click();
		Thread.sleep(4000);
	}
	
	 public void logoVerify() {
		 	String expectation = "Green Mark Natural Solutions - Top Ayurvedic Herbal Products and Medicine Dealer in Mullurkkara, Thrissur, Kerala, India";
			String actual = driver.getTitle();
			System.out.println("Actual Result : "+actual);
			Assert.assertEquals(actual, expectation);
		}
		
	public void searchText(String val) throws InterruptedException {
		srchField.sendKeys(val);
		Thread.sleep(4000);
	}

	public void clickSrchIcon() throws InterruptedException {
		srchIcon.click();
		Thread.sleep(4000);
	}	
	
	public void slctHerbalShamboo() {
		herbalShamboo.click();
	}
	 
	public void AddToWishlist() {
		wishlist.click();
	}
	
	public void AddShamboToCart() {
		addShambooCart.click();
	}
	
	 public void HerbalBeuty() throws InterruptedException {
		herbalBeauty.click();
		Thread.sleep(2000);
	}
		
	public void clickNeem() throws InterruptedException {
		neemFaceWash.click();
		Thread.sleep(3000);
	}
	
	public void SlctOrange() throws InterruptedException {
		orangeFaceWash.click();
		Thread.sleep(4000);
	}
	
	public void SlctCart() throws InterruptedException {
		addToCart.click();
		Thread.sleep(4000);
	}
//	
//	public void DropDwnQty() {
//		QtyDrpDwn.click();
//		Select dd = new Select(QtyDrpDwn);
//		dd.selectByValue("3");
//	}
	
	public void ClickCntinueShopping() {
		continueShopping.click();
	}

	public void ClickImage() {
		imageView.click();
	}
	
	public void ClickClose() {
		close.click();
	}
	
	public void clickVideo() {
		videoView.click();
	}
	
	public void clickVideoClose() {
		closeVideo.click();
	}
	
	public void cartSlct() {
		cart.click();
	}
	
	public void FooterSlct() {
		footer.click();
	}
	
	  public void logoPrsnt() {
			
			if(logo) {
				System.out.println("Logo is present");
			}
			else{
				System.out.println("Logo is not present");
			}
		}
	  
	  public void CartLocatee() {
		  CartLocate.click();
	  }
	  
	  public void LocateClrCart() {
		  clrCart.click();
	  }
	  
	  public void JustDialWindowHandle() throws InterruptedException {
		  justDial.click();
		  String parentWindow = driver.getWindowHandle();
		  System.out.println("parentWindow = "+driver.getTitle());
		  
		  Set<String> allWindowHandles = driver.getWindowHandles();
			for(String handle : allWindowHandles) {
				if(!handle.equalsIgnoreCase(parentWindow)) {
					driver.switchTo().window(handle);
					Thread.sleep(4000);
		  
					driver.close();
				}
				driver.switchTo().window(parentWindow);
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
	  
	  public void mouseTowtsup() throws InterruptedException {
			Actions act = new Actions(driver);
			act.moveToElement(whatsapp).perform();
			Thread.sleep(2000);
		}
	  
	  public void slctWtsup() {
		  whatsapp.click();
	  }
	  
	  public void Alert() {
		  org.openqa.selenium.Alert alert = driver.switchTo().alert();
		  alert.accept();
	  }
}