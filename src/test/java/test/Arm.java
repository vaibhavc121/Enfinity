package test;

public class Arm
{

	public static void main(String[] args)
	{
		int no=154;
		int tno=no;
		int tot=0;
		while(no>0)
		{
			int mod=no%10;
			tot=tot+(mod*mod*mod);
			no=no/10;
			
		}
		if(tno==tot)
		{
			System.out.println("arm");
		}
		else
		{
			System.out.println("not arm");
		}

	}

}
