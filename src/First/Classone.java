package First;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Classone {
	
	public WebDriver driver1;
	
	public Classone(WebDriver driver2) {
		
		driver1 = driver2;
		
		PageFactory.initElements(driver2, this);

	}
	

	@FindBy(name="username")
	WebElement inputusername;
	@FindBy(id="password")
	WebElement inputpassword;
	//@FindBy(name="login")
	@FindBy(xpath="//*[@class='login_button']")
	WebElement clickbtnlogin;
	//@FindBy(name="location")
	//WebElement inputLocation;
	@FindBy(xpath="//Select[@name ='location']")
	WebElement Locationdropdown;
	@FindBy(name="hotels")
	WebElement Hotelsdropdown;
	@FindBy(name="room_type")
	WebElement Roomtypedropdown;
	@FindBy(name="room_nos")
	WebElement Noofroomsdropdown;
	@FindBy(name="datepick_in")
	WebElement checkindate;
	@FindBy(name="datepick_out")
	WebElement checkoutdate;
	@FindBy(name="adult_room")
	WebElement Adultperroom;
	@FindBy(name="child_room")
	WebElement childrensperroom;
	@FindBy(name="Submit")
	WebElement clicksearchbutton;
	
	
	public void setusername() 
	{
	inputusername.sendKeys("bindubindu");
	}
	
	public void setpassword() 
	{
	inputpassword.sendKeys("NTYEJ7");
	}
	
	public void clickLoginbutton()
	{
		clickbtnlogin.click();
	
	}
	public void setLocation()
	{
		Select Locationdrp = new Select(Locationdropdown);
	Locationdrp.selectByValue("London");	
	}
	public void sethotels()
	{
	Select Hotels = new Select(Hotelsdropdown);
	Hotels.selectByValue("Hoetel creek");
	}
	public void setRoomtype()
	{
	Select Roomty = new Select(Roomtypedropdown);
	Roomty.selectByValue("Double");
	}
	public void setNoofrooms()
	{
	Select NoRoom = new Select(Noofroomsdropdown);
	NoRoom.selectByValue("1-One");
	}
	public void setcheckindate()
	{
	Select checkin = new Select(checkindate);
	checkin.selectByValue("30/03/2023");
	}
	public void setcheckoutdate()
	{
	Select checkout = new Select(checkoutdate);
	checkout.selectByValue("31/03/2023");
	}
	public void setAdults()
	{
	Select Adults = new Select(Adultperroom);
	Adults.selectByValue("1-One");
	}
	public void setChildrens()
	{
	Select Childrens = new Select(childrensperroom);
	Childrens.selectByValue("1-One");
	}
	public void clicksearchbutton()
	{
	clicksearchbutton.click();
	
	}

	
	//WebElement LocationdrpEle  = driver1.findElement(By.id("location"));
	//Select ld = new Select(LocationdrpEle);
	
	
	
}

