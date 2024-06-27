package prcatice;

import java.util.PriorityQueue;

public class MultiThreading {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		
		Thread t1=new Thread(() ->
		{
			for(int i=0;i<5;i++)
			{
	          System.out.println("hi");
	          try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		});
		
		Thread t2=new Thread(() ->
		{
			for(int i=0;i<5;i++)
			{
	          System.out.println("hello");
	          try {
	  			Thread.sleep(500);
	  		} catch (InterruptedException e) {
	  			// TODO Auto-generated catch block
	  			e.printStackTrace();
	  		}
			}
		});
		t1.start();
	
		t2.start();
       
     

      
	}



}


