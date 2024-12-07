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

	@FindBy(xpath="//span[text()='New Record']")
	public WebElement selapp1;
	
	@FindBy(xpath="//div[@data-value='at3-newframeworkairtaflkk02']")
	public WebElement selconn;
	
	@FindBy(xpath="//span[text()='New Record']")
	public WebElement seltrigg;
	
	@FindBy(xpath="//button[text()='Continue']")
	public WebElement goto1;
	
	@FindBy(xpath="//button[text()='Continue']")
	public WebElement goto2;
	
	
// Action Config
	
	@FindBy(xpath="//input[@placeholder='Search apps']")
	public WebElement search;
	
	@FindBy(xpath="//div[@class='flex gap-4 items-center']")
	public WebElement selectapp;
	
	@FindBy(xpath="//div[@data-value='at3-newframeworkairtaflkk02']")
	public WebElement selectcon;
	
	@FindBy(xpath="//span[text()='Create Record']")
	public WebElement action;
	
	
	@FindBy(xpath="//button[text()='Continue']")
	public WebElement nstep1;
	
	@FindBy(id="email")
	public WebElement email;
	

	@FindBy(xpath="//span[text()='Id']")
	public WebElement map1;
	
	@FindBy(xpath="//span[text()='Custom Field Cf Email']")
	public WebElement scroll1;
	
	@FindBy(xpath="//button[text()='Continue']")
	public WebElement acont;
	
	@FindBy(xpath="//button[text()='Continue']")
	public WebElement aconti;
	
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
	
	public void clickContinuebutton1()
	{
		waitForClickElement(goto1,30);
		clickElement(goto1);
	}
	
	public void clickContinuebutton2()
	{
		waitForClickElement(goto2,30);
		clickElement(goto2);
	}
	
	public void searchApp1(String text)
	{
		waitForElement(search,30);
		typeText(search,text);
	}
	
	public void selectApp1()
	{
		waitForElement(selectapp,30);
		clickElement(selectapp);
	}
	
	public void selectConnection1()
	{
		waitForElement(selectcon,30);
		clickElement(selectcon);
	}
	
	public void selectAction()
	{
		actionsMoveToElement(action);
//		waitForClickElement(action,10);
		actionsDoubleClick(action);
	}
	
	public void clickcontinuetoNext()
	{
		waitForElement(nstep1,30);
		clickElement(nstep1);
	}
	
	
	public void emailMap()
	{
		waitForElement(email,10);
		clickElement(email);
	}
	
	public void clickDynamicfield()
	{
		waitForElement(map1,10);
		actionsMoveToElement(map1);
		
		javascriptExecutorScrollWebElement(scroll1);
		clickElement(scroll1);
	}
	
	public void clickContinuebutton3()
	{
		waitForClickElement(acont,30);
		clickElement(acont);
	}
	
	public void clickContinuebutton4()
	{
		waitForClickElement(aconti,30);
		clickElement(aconti);
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
	
	


}
