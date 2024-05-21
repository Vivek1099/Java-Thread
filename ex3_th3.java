package Multhreading;

//multithread by extending thread class
class c6 extends Thread
{
	String msg;
	c6(String message)
	{
		msg=message;
	}
	public void run()
	{
		for(int x=1; x<=5; x++)
		{
			try 
			{
				System.out.println(x+" "+msg);Thread.sleep(2000);
			}
			catch(Exception ee)
			{
				
			}
		}
	}
}
public class ex3_th3 {
	public static void main(String args[]) throws Exception
	{
		c6 c=new c6("Ramesh");
		c6 c1=new c6("Rahul");
		c6 c2=new c6("Rajesh");
	
		c.start();
		c.join();
		c1.start();
		c1.join();
		c2.start();
	}
}
