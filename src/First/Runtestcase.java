package First;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Runtestcase extends Base {
	
	@Test
	public void test() throws InterruptedException, IOException {
		
		Classone clo = new Classone(driver);
		clo.setusername();
		logger.info("username is entered");
		Thread.sleep(3000);
		clo.setpassword();
		logger.info("password is entered");
		clo.clickLoginbutton();
		logger.info("Loginbutton is clickable");
		
		//Thread.sleep(3000);
		//logger.info("Location is entered");
		//clo.sethotels();
		//logger.info("Hotel is entered");
		//clo.setRoomtype();
		//logger.info("Roomtype is entered");
		//clo.setNoofrooms();
		//logger.info("Noofrooms is entered");
		//clo.setcheckindate();
		//logger.info("checkin is entered");
		//clo.setcheckoutdate();
		//logger.info("checkout is entered");
	//	clo.setAdults();
	//	logger.info("Adults is entered");
		//clo.setChildrens();
		//logger.info("Childrens is entered");
		//clo.clicksearchbutton();
	//	logger.info("searchbutton is clickable");
		logger.info(driver.getTitle());
		if(driver.getTitle().equals("My profiles:Adactin")) {
			Assert.assertTrue(true);
		}
		else 
			CaptureScreeen(driver,"Login test");
		Assert.assertTrue(false);
		logger.info("login is failed");
	
		{
			Assert.assertTrue(false);
		}
		
		
	}

}
    