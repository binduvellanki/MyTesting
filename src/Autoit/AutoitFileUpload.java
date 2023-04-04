package Autoit;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AutoitFileUpload {

	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.foundit.in/seeker/registration");
		
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[4]/div/div/div/form/div[1]/div[2]/div/div/div[1]/div/label/span")).click();
		
		
		//using autoit method
		Runtime.getRuntime().exec("C:\\Users\\RAJRAMYA\\OneDrive\\Documents\\Autoscript.exe"+" "+"C:\\Users\\RAJRAMYA\\OneDrive\\Documents\\V.BindukeerthiResume13.02.23.docx");
		

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)"," ");
		
			
		
	 
		
	}

}

