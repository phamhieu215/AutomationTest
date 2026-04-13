package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day4 {
	@Test
	public void WebloginCarLoan()
	{
		System.out.println("wenlogincar");
	}
	@Test(groups= {"smoke"})
	public void MobilelogincarLoan()
	{
		System.out.println("Mobilelogincar");
	} 
	@BeforeSuite
	public void Bfsuite() {
		System.out.println("I am no 1");
	}
	
	@Test
	public void LoginAPIcarLoan()
	{
		System.out.println("APIlogincar");
	} 
}
