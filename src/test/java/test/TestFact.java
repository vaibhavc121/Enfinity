package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import dev.Fact;

public class TestFact extends Fact
{
	@Test
	public void test()
	{
		int exp=24;
		int act=fact(4);
		Assert.assertEquals(act, exp);
	}

}
