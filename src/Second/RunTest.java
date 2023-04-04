package Second;

import org.testng.annotations.Test;



public class RunTest extends RegBase{
	
	@Test
	public void run() throws InterruptedException {
		
		Registrationpom Rp = new Registrationpom(driver);
		
		
		Rp.setusername();
		logger.info("username is entered");
		Rp.setpassword();
		logger.info("password is entered");
		Rp.setconfirmpassword();
		logger.info("confirmpassword is entered");
		Rp.setfullname();
		logger.info("fullname is entered");
		Rp.setemailaddress();
		logger.info("emailaddress is entered");
		Thread.sleep(15000);
		//Rp.setcaptcha();
		Rp.clickcheckbox();
		logger.info("checkbox is clickable");
		Rp.clickregisterbutton();
		logger.info("registerbutton is clickable");
		}
}

