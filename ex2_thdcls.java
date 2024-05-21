package Multhreading;


class c5 extends Thread
{
	public void run()
	{
		for(int x=1; x<=5; x++)
		{
			try 
			{
				System.out.println(x);Thread.sleep(2000);
			}
			catch(Exception ee)
			{
				
			}
		}
	}
}
public class ex2_thdcls 
{
	public static void main(String args[])
	{
		c5 t=new c5();
		t.start();
	}
}

