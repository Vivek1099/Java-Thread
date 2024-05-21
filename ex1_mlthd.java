package Multhreading;

//two ways to make thread 1>extends thread class 2> implementing runnable interface
public class ex1_mlthd {
	public static void main(String args[])
	{
		Thread t=Thread.currentThread();
		System.out.println(t);
		t.setName("Ramesh");
		System.out.println("new Thread name is "+t);
		System.out.println(t.getId());
		System.out.println(t.getPriority());
		System.out.println(t.NORM_PRIORITY);
		System.out.println(t.MAX_PRIORITY);
		System.out.println(t.MIN_PRIORITY);
	}
}
