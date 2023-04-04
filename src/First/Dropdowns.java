package First;

import org.testng.annotations.Test;

public class Dropdowns extends  Base{
	
	@Test
	public void drp() {
		driver.get("https://adactinhotelapp.com/SearchHotel.php");
		Classone clo = new Classone(driver);
		
	
	clo.setLocation();
	logger.info("Location is entered");
	clo.sethotels();
	logger.info("Hotel is entered");
	clo.setRoomtype();
	logger.info("Roomtype is entered");
	clo.setNoofrooms();
	logger.info("Noofrooms is entered");
	clo.setcheckindate();
	logger.info("checkin is entered");
	clo.setcheckoutdate();
	logger.info("checkout is entered");
	clo.setAdults();
	logger.info("Adults is entered");
	clo.setChildrens();
	logger.info("Childrens is entered");
	clo.clicksearchbutton();
	logger.info("searchbutton is clickable");

}
}
