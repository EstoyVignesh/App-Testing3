package airtable.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import airtable.utils.SeWrapper;

public class Airtable1 extends SeWrapper {
	
	@FindBy(name="email")
	public WebElement mail;

	@FindBy(name="password")
	public WebElement pass;

	@FindBy(xpath="(//p[text()='Log in'])")
	public WebElement button1;

	@FindBy(xpath="//div[@class='p-4 flex justify-center rounded-full w-24 h-10 items-center cursor-pointer bg-blue-300 font-bold']")
	public WebElement kon1;

	@FindBy(xpath="//span[text()='New Konnector']")
	public WebElement newk1;

	@FindBy(xpath="//span[text()='Trigger']")
	public WebElement trigg;

	@FindBy(xpath="//input[@placeholder='Search apps']")
	public WebElement app;

	@FindBy(xpath="//span[text()='Airtable']")
	public WebElement selapp1;
	
	@FindBy(xpath="//div[@data-value='at3-newframeworkairtaflkk02']")
	public WebElement selconn;

	@FindBy(xpath="//span[text()='New Record']")
	public WebElement seltrigg;

	@FindBy(xpath="//button[text()='Continue']")
	public WebElement goto1;

	@FindBy(xpath="//span[text()='Edit']")
	public WebElement edit;

	@FindBy(xpath="//button[text()='Choose Base']")
	public WebElement base;

	@FindBy(xpath="//span[text()='Stripe']")
	public WebElement clbase;

	@FindBy(xpath="(//button[@type='button'])[4]")
	public WebElement table;

	@FindBy(xpath="//span[text()='Table 2']")
	public WebElement cltable;

	@FindBy(xpath="//button[text()='Continue']")
	public WebElement goto2;
	
	
// Action Config
	
	@FindBy(xpath="//input[@placeholder='Search apps']")
	public WebElement search;
	
	@FindBy(xpath="(//span[text()='Airtable'])[2]")
	public WebElement selapp2;
	
	@FindBy(xpath="//div[@data-value='at3-newframeworkairtaflkk02']")
	public WebElement selconn1;

	@FindBy(xpath="//span[text()='Create Record']")
	public WebElement selact;

	@FindBy(xpath="//button[text()='Continue']")
	public WebElement goto3;
	
	@FindBy(xpath="//button[text()='Choose Base']")
	public WebElement base1;

	@FindBy(xpath="//span[text()='Stripe']")
	public WebElement clbase1;

	@FindBy(xpath="(//button[@type='button'])[4]")
	public WebElement table1;

	@FindBy(xpath="//span[text()='Table 2']")
	public WebElement cltable1;
	
	@FindBy(xpath="//span[text()='Enter Name or choose a field']")
	public WebElement sf1;
	
	@FindBy(xpath="//input[@placeholder='Search Field']")
	public WebElement inf1;
	
	@FindBy(xpath="//span[text()='Fields Name']")
	public WebElement cf1;
	
	@FindBy(xpath="//span[text()='Enter Assignee id or choose a field']")
	public WebElement sf2;
	
	@FindBy(xpath="//input[@placeholder='Search Field']")
	public WebElement inf2;
	
	@FindBy(xpath="//span[text()='Fields Assignee Id']")
	public WebElement cf2;
	

	@FindBy(xpath="//button[text()='Continue']")
	public WebElement goto4;
	
	@FindBy(xpath="//button[text()='Save']")
	public WebElement save;
	
	@FindBy(name="username")
	public WebElement kname;
	
	@FindBy(xpath="//button[text()='Save changes']")
	public WebElement saveit;
	
	@FindBy(xpath="//button[text()='Publish']")
	public WebElement publish;
	
	@FindBy(xpath="//button[text()='Activate Now']")
	public WebElement active;
	
	
	
	
	
	public void email(String email)
	{
		waitForElement(mail,30);
		typeText(mail,email);
	}
		
	public void Password(String pwd)
	{
		waitForElement(pass,30);
		typeText(pass,pwd);
	}

	public void Login()
	{
		waitForElement(button1,30);
		clickElement(button1);
	}


	public void ButtonNew()
	{
		waitForElement(kon1,30);
		clickElement(kon1);
	}

	public void Konnector()
	{
		waitForElement(newk1,30);
		clickElement(newk1);
	}

	public void trigger()
	{
		waitForElement(trigg,30);
		clickElement(trigg);
	}

	public void searchApp(String text)
	{
		waitForElement(app,30);
		typeText(app,text);
	}

	public void selectApp()
	{
		waitForClickElement(selapp1,30);
		clickElement(selapp1);
	}

	public void selectConnection()
	{
		waitForClickElement(selconn,30);
		clickElement(selconn);
	}

	public void selectTrigger()
	{
		waitForClickElement(seltrigg,30);
		clickElement(seltrigg);
	}

	public void clickContinuebutton1() throws InterruptedException
	{
		waitForClickElement(goto1,10);
		clickElement(goto1);
		waitForClickElement(base,30);
		Thread.sleep(3000);
	}



	public void clickBase1()
	{

		actionsMoveToElement(base);
		waitForClickElement(base,30);
		clickElement(base);
		
		waitForClickElement(clbase,30);
		clickElement(clbase);
		
		}

	

	public void clickTable1()
	{

		actionsMoveToElement(table);
		waitForClickElement(table,30);
		clickElement(table);
		
		waitForClickElement(cltable,30);
		clickElement(cltable);
		
		
	}
	
	
	
//	public void assigneeField(String text)
//	{
//		javascriptExecutorScrollWebElement(sf2);		
//		actionsDoubleClick(sf2);
//		
//		typeText(inf2,text);
//		clickElement(cf2);		
//		
//		
//	}

	public void clickContinuebutton2() throws InterruptedException
	{
		waitForClickElement(goto2,30);
		clickElement(goto2);
		Thread.sleep(2000);
	}
	
	
	//Action Configuration
	
	public void searchApp1(String text) throws InterruptedException
	{
		Thread.sleep(2000);
		waitForElement(search,30);
		typeText(search, text);
		
	}
	
	public void selectApp1() throws InterruptedException
	{
		Thread.sleep(2000);
		actionsMoveToElement(selapp2);
		clickElement(selapp2);
	}
	
	public void selectConnection1()
	{
		waitForElement(selconn1,30);
		clickElement(selconn1);
	}
	
	public void selectAction()
	{
		actionsMoveToElement(selact);
		waitForClickElement(selact,10);
		actionsDoubleClick(selact);
	}
	
		
	public void clickContinuebutton3() throws InterruptedException
	{
		waitForClickElement(goto3,10);
		clickElement(goto3);
		waitForClickElement(base1,30);
		Thread.sleep(3000);
	}



	public void clickBase2()
	{

		actionsMoveToElement(base1);
		waitForClickElement(base1,30);
		clickElement(base1);
		
		waitForClickElement(clbase1,30);
		clickElement(clbase1);
		
		}

	

	public void clickTable2()
	{

		actionsMoveToElement(table1);
		waitForClickElement(table1,30);
		clickElement(table1);
		
		waitForClickElement(cltable1,30);
		clickElement(cltable1);
		
		
	}

	public void nameField(String text)
	{
		
		actionsDoubleClick(sf1);
		
		typeText(inf1,text);
		clickElement(cf1);	
		
		
		
	}
	
	
	public void clickContinuebutton4() throws InterruptedException
	{
		waitForClickElement(goto4,30);
		clickElement(goto4);
		Thread.sleep(2000);
	}
	
	
	public void clickSaveButton()
	{
		waitForClickElement(save,30);
		clickElement(save);
	}
	
	public void nameKonnector(String text)
	{
		waitForElement(kname,30);
		kname.clear();
		typeText(kname,text);
	}
	
	public void clickSaveChanges()
	{
		waitForClickElement(saveit,30);
		clickElement(saveit);
	}
	
	public void clickPublish()
	{
		waitForClickElement(publish,30);
		clickElement(publish);
	}
	
	public void clickActiveNow()
	{
		waitForClickElement(active,30);
		clickElement(active);
	}
	
	public void closeAllBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		closeAllBrowsers();
		
	}
	
	



}
