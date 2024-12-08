# App-Testing3

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
		waitForClickElement(goto1,10);
		clickElement(goto1);
		waitForClickElement(base,30);
	}
	
	public void clickEdit()
	{
		waitForClickElement(edit,10);
		clickElement(edit);
		
	}
	
	public void clickBase1()
	{
		
		clickElement(base);
		
		}
	
	public void clickBase2()
	{
			
		waitForClickElement(clbase,30);
		clickElement(clbase);
	}
	
	public void clickTable1()
	{
		waitForClickElement(table,30);
		clickElement(table);
		
		
	}
	
	public void clickTable2()
	{
				
		waitForClickElement(cltable,30);
		clickElement(cltable);
	}
	
	
	
	
	
	public void clickContinuebutton2()
	{
		waitForClickElement(goto2,30);
		clickElement(goto2);
	}
	
