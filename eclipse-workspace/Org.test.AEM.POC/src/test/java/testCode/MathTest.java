package testCode;

import org.testng.Assert;
import org.testng.annotations.Test;


import devCode.MathCode;

public class MathTest {

	@Test
	public void unitTest1()
	{
		MathCode obj = new MathCode();
		Assert.assertEquals(obj.getAbsVal(-1), 1);
	}
	
	@Test
	public void unitTest2()
	{
		MathCode obj = new MathCode();
		Assert.assertEquals(obj.getAbsVal(-2), 2);
	}
	
	@Test
	public void unitTest3()
	{
		MathCode obj = new MathCode();
		Assert.assertEquals(obj.getAbsVal(2), 2);
		System.out.println("Test with Anupama!!!");
	}
}
