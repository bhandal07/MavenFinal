package PageTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Page.LoginPage;

@Listeners(testnglistener.class)

public class Parallelexecution extends Baseclass {

	@Test
	
	
	public void LoginPass1()
	{
		LoginPage Loginobj=  new LoginPage();
		
		   String uname = sheet.getRow(1).getCell(0).getStringCellValue();
	        String pword = sheet.getRow(1).getCell(1).getStringCellValue();
		 Loginobj.LoginPass(uname,pword);
	}
	
	public void LoginPass2()
	{
		LoginPage Loginobj=  new LoginPage();
		
		   String uname = sheet.getRow(1).getCell(0).getStringCellValue();
	        String pword = sheet.getRow(1).getCell(1).getStringCellValue();
		 Loginobj.LoginPass(uname,pword);
	}

}
