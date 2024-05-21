package Multhreading;


class aa implements Runnable
{
	String msg;
	aa(String message)
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
public class ex5_th5 {
	public static void main(String args[]) throws Exception
	{
		aa a=new aa("Ramesh");
		aa a1=new aa("Raju");
		aa a2=new aa("Rakesh");
		
		Thread t=new Thread(a);
		Thread t1=new Thread(a1);
		Thread t2=new Thread(a2);
		
		t.start();
		t.join();
		t1.start();
		t1.join();
		t2.start();		
	}
}
