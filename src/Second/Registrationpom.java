package Second;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Registrationpom {
	//public WebDriver driver;
	public WebDriver driver1;// It is a Global variable.
	
	
	public Registrationpom(WebDriver driver2)  //driver2 is the parameter.
	// some ambicutic issues we are write 
	{
	//public Registrationpom(WebDriver driver){
		driver1=driver2;
		PageFactory.initElements(driver2,this);
	}
	


	@FindBy(name="username")
	WebElement inputusername;
	@FindBy(id="password")
	WebElement inputpassword;
	@FindBy(name="re_password")
	WebElement inputconfirmpassword;
	@FindBy(name="full_name")
	WebElement inputfullname;
	@FindBy(name="email_add")
	WebElement inputemailaddress;
	@FindBy(name="captcha")
	WebElement inputcaptchatext;
	@FindBy(name="tnc_box")
	WebElement clickcheckbox;
	@FindBy(name="Submit")
	WebElement clickregisterbutton;
	
	
	
	
	public void setusername()
	{
	inputusername.sendKeys("Keerthibindu1234567891021");
	}
	public void setpassword()
	{
	inputpassword.sendKeys("bindu123");
	}
	public void setconfirmpassword()
	{
	inputconfirmpassword.sendKeys("bindu123");
	}
	public void setfullname()
	{
	inputfullname.sendKeys("bindukeerthi");
	}
	public void setemailaddress()
	{
	inputemailaddress.sendKeys("bindukerthvellanki@gmail.com");
	}
	//public void setcaptcha()
	//{
	//inputcaptchatext.sendKeys("argaans");
	//}
	public void clickcheckbox() 
	{
		clickcheckbox.click();
		}
		public void clickregisterbutton()
		{
	clickregisterbutton.click();
	
	}
		
		
		
		
}
		
	


