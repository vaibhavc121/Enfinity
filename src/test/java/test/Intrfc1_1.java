package test;

import dev.Intrfc1;

public class Intrfc1_1 implements Intrfc1
{
	int a=2,b=2,c;
	public void add()
	{
		c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args)
	{
		Intrfc1_1 ob=new Intrfc1_1();
		ob.add();
	}
}
