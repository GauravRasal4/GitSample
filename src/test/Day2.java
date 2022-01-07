package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test
	public void meeting()
	{
		System.out.println("Day-2 what are doing?");
		
	}
	@Test
	public void meeting1()
	{
		System.out.println("Day-2 Nothing");
		
	}
	@Test
	public void meeting2()
	{
		System.out.println("Day-2 Looking Good");
		
	}
	@Test
	public void meeting3()
	{
		System.out.println("Day-2 Thanks");
		
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Day-2 Before class testing");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("Day-2 After class testing");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Day-2 Its Before testing");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("Day-2 Its After testing");
	}

}
