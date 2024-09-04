package test;

import dev.Intrfc2;
import dev.Intrfc3;

public class Intrfc2_Test implements Intrfc2, Intrfc3
{

	@Override
	public void tiger()
	{
		System.out.println("tiger fun");
		
	}

	@Override
	public void dog() 
	{
		System.out.println("dog fun");
		
	}

	@Override
	public void cat() 
	{
		System.out.println("cat fun");
		
	}

}

