package test;

import org.testng.annotations.Test;

public class day3 {
	@Test
	public void WebloginHomeLoan()
	{
		System.out.println("wenloginhome");
	}
	@Test(groups= {"smoke"})
	public void MobileloginHomeLoan()
	{
		System.out.println("MobileloginHome");
	} 
	@Test
	public void LoginAPIcarLoan()
	{
		System.out.println("APIloginHome");
	} 
}
