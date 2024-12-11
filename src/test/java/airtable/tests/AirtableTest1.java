package airtable.tests;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import airtable.utils.ATwrapper;
import airtable.utils.Reports;
import airtable.utils.SeWrapper;


public class AirtableTest1 extends SeWrapper{
	
	

	@BeforeTest
	public void login()
	{
		//excelfile ="AirtableLogin";
//		sheet1 = "sheet1";
	}
	
	AT a = new AT();
	Reports report = new Reports();
	
	@Parameters({"browser","url"}) 
	@BeforeMethod
	public void login1(String browserName, String url)
	{
		report.setTCDesc("Validating Signup Function");
		launchCrossBrowser(browserName,url);
	}
	
	
/*	@Test(dataProvider = "get",priority=1)
	 
	public void loginTest(String email,String pass, String app, String connname, String baseurl, String key)
	{		
		j.loginwithCorrectdata(email, pass, app, connname, baseurl, key);
//		j.createForm(email, pass);
	}
	
	*/
	
	//@Test(dataProvider = "get",priority=1)
//	@Test(priority=1)
//	public void logintest1() throws Throwable
//	{		
//		
//		a.loginandRunapp1();
//	}
//	
	@Test(priority=1)
	public void logintest2() throws Throwable
	{		
		
		a.loginandRunapp2();
	}
	
	
//	@Test(dataProvider = "get",priority=2)
//	public void logintest2( String app1)
//	{		
//		
//		j.loginandRunapp1(app1);
//	}
	
	
	/*
	@DataProvider(name = "get")
	public String[][] getdata() throws IOException{
	String[][] data = excelRead(excelfile,sheet1);   //Method 1
	
	//Method 2
	//String[][] data = excelRead(excelfile);
	
	return data;
	
	}
	*/

}
