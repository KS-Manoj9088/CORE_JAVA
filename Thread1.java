import java.util.*;
import java.lang.*;

class MyThread extends Thread implements Runnable 
{
	public  void run()
	{		
	try
	{
		sleep(1000);
	}
	catch(InterruptedException e1)
	{
		e1.getMessage();
	}
		System.out.println("Hello!!");
		
	}
}

public class Thread1
{
	public static void main(String[] args)
	{
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		System.out.println("in main method");
		
		t1.setPriority(10);
		
		t1.start();
		
		try{
				t2.join();
				t2.yield();
		}
		catch(InterruptedException e)
		{
			e.getMessage();
		}
		
		t2.start();
	}
}