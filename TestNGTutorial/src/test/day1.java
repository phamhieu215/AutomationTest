package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {

	
	@AfterTest
	public void lastexecution() {
		System.out.println("I will execute last");
	}
	@Test(groups= {"smoke"})
	public void Demo() 
	{
		System.out.println("hello");
	}
	@AfterSuite
	public void afSuite() {
		System.out.println("I am  no 1 the last");
	}
	@Test
	public void SecondTest()
	{
		System.out.println("Bye");
	}


}
