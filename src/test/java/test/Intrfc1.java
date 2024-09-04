package test;

import dev.Intrfc0;

public class Intrfc1 implements Intrfc0
{

	@Override
	public void fun() 
	{
		int a=2,b=2;
		int c=a+b;
		System.out.println(c);
		
	}
	
	public static void main(String[] args) 
	{
		Intrfc1 ob= new Intrfc1();
		ob.fun();
	}

}
