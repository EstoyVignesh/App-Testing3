package airtable.utils;

import org.openqa.selenium.support.PageFactory;

import airtable.pages.Airtable1;


public class ATwrapper extends SeWrapper{
	
	public void loginandRunapp1() throws Throwable
	{
	
	Airtable1 at = PageFactory.initElements(driver,Airtable1.class);
	
	at.email("Konnectifyqa+5@gmail.com");
	at.Password("Testing@123");
	at.Login();
	at.ButtonNew();
	at.Konnector();
	at.trigger();
	at.searchApp("Airtable");
	at.selectApp();
	at.selectConnection();
	at.selectTrigger();
	at.clickContinuebutton1();
	at.clickContinuebutton2();
	
		
	}

}
