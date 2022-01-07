package test;

import org.testng.annotations.Test;

public class Day3 {
	
	@Test
	public void chating()
	{
		System.out.println("Day-3 You Need something?");
		
	}
	@Test (groups = {"Smoke"})
	public void chating1()
	{
		System.out.println("Day-3 I need glass of water");
		
	}
	@Test (groups = {"Smoke"})
	public void chating2()
	{
		System.out.println("Day-3 take this");
		
	}

}
