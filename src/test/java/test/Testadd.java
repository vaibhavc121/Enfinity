package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import dev.Add;

public class Testadd extends Add
{
	@Test
	public void test()
	{
		int exp=4;
		int act=add(2, 3);
		Assert.assertEquals(act, exp);
	}
	
}
