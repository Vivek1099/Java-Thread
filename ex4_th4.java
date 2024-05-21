package Multhreading;


class cc implements Runnable
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
public class ex4_th4 {
	public static void main(String args[])
	{
		cc c=new cc();
		Thread tt=new Thread(c);
		tt.start();
	}
}
