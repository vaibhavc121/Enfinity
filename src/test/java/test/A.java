package test;


import dev.Intrfc0;

class A implements Intrfc0 
{
   static public int fun(int a, int b) 
    {
        
        
        int c=a+b;
        return c;
    }

    public static void main(String[] args) 
    {
        A a = new A();
          
        System.out.println(fun(2,2));
    }

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		
	}
}