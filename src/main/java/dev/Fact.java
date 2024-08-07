package dev;

public class Fact 
{
	public int fact(int no)
	{
		int res=1;

		for(int i=1;i<=no;i++)
		{
			res=res*i;			
		}
		return res;
	}

}
