package airtable.utils;

import org.openqa.selenium.support.PageFactory;

import airtable.pages.Airtable1;


public class ATwrapper extends SeWrapper{
	
	public void loginandRunapp1() throws Throwable
	{
	
	Airtable01 at = PageFactory.initElements(driver,Airtable01.class);
	
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
	
	at.clickBase1();
	
	
	at.clickTable1();
	
	at.clickContinuebutton2();
	
	at.searchApp1("Airtable");
	at.selectApp1();
	at.selectConnection1();
	at.selectAction();
	at.clickContinuebutton3();
	
	at.clickBase2();
	
	
	at.clickTable2();
	at.nameField("name");
	at.clickContinuebutton4();
	at.clickSaveButton();
	at.nameKonnector("Airtable-NewRecord$CreateRecord");
	at.clickSaveChanges();
	at.clickPublish();
	at.clickActiveNow();
	at.closeAllBrowser();
	
		
	}
	
	public void loginandRunapp2() throws Throwable
	{
	
	Airtable02 at = PageFactory.initElements(driver,Airtable02.class);
	
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
	
	at.clickBase1();
	
	
	at.clickTable1();
	at.selectModified();
	
	at.clickContinuebutton2();
	
	at.searchApp1("Airtable");
	at.selectApp1();
	at.selectConnection1();
	at.selectAction();
	at.clickContinuebutton3();
	
	at.clickBase2();
	at.clickTable2();
	at.clickRecordID();
	at.clickUdateMethod(1000);
	at.nameField("name");
	at.clickContinuebutton4();
	at.clickSaveButton();
	at.nameKonnector("Airtable-UpdatedRecord$UpdateRecord");
	at.clickSaveChanges();
	at.clickPublish();
	at.clickActiveNow();
	
		
	}

}
