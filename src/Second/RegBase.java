package Second;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegBase {
	
	public WebDriver driver;
	public static Logger logger;
	@BeforeClass
	public void regtest() 
	{
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		logger = Logger.getLogger("Adactin");
		PropertyConfigurator.configure("log4j.properties");
		
		//Thread.sleep(3000);
		
		driver.get("https://adactinhotelapp.com/Register.php");
		
	

	
	}
}
