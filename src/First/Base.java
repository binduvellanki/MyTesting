package First;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Base {
	public WebDriver driver;
	public static Logger logger;
	//@Parameters("browsers")
	@BeforeClass
	public void Firsttest() 
	{

		logger = Logger.getLogger("Adactin");
		PropertyConfigurator.configure("log4j.properties");
	
		//if(br.equals("chrome")) 
		//{
		//System.setProperty("webdriver.chrome.driver","./drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		
	
		//}
		//else if(br.equals("firefox"))
		//{
		//WebDriverManager.firefoxdriver().setup();
		//driver = new FirefoxDriver();
		//}
		//else if (br.equals("msedge")) 
		//WebDriverManager.edgedriver().setup();
		//driver = new EdgeDriver();
		//{
			
		
		
		driver.get("https://adactinhotelapp.com/");

		
		
		
}
	public void CaptureScreeen(WebDriver driver,String tname) throws IOException {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./Screenshots/"+tname+".png");
	FileUtils.copyFile(src, target);
	logger.info("screenshot is taken");
		
	}	
		
}

