package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {
	
	@Test
	public void planning()
	{
		System.out.println("Day-1 Hello Gaurav");
		
	}
	
	@Test
	public void planning1()
	{
		System.out.println("Day-1 Hello Chaitu");
	}
	@Test
	public void planning2()
	{
		System.out.println("Day-1 How are you?");
	}
	@Test
	public void planning3()
	{
		System.out.println("Day-1 Fine");
	}
	@BeforeTest
	public void beforeTesting()
	{
		System.out.println("Day-1 Its Before testing");
	}
	@AfterTest
	public void afterTesting()
	{
		System.out.println("Day-1 Its After testing");
	}
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Day-1 Its Before Suite");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Day-1 Its After Suite");
	}
	@BeforeMethod
	public void beforeMethods()
	{
		System.out.println("Day-1 Before every methods");
	}
	@AfterMethod
	public void afterMethods()
	{
		System.out.println("Day-1 After every methods");
	}
	

}
