package com.test;

/*
 * There are Two type of Thread 
 * 
 * 1) User Thread --> The thread which is created by application developer example : 
 *                    creating thread using Thread class and Runnable interface 
 * 2) Daemon Thread --> Daemon threads are service providers for user 
 *                      threads running in the same process.
 *                      They are typically used for background tasks 
 *                      such as garbage collection , monitoring, etc , Debugging.
 * 
 * 
 * 
 * User Thread is done by Two ways
 * 1) Thread Class
 * 2) Runnable Interface 
 * 
 *  note : both having run method to override in our class and perform multi threading
 *  
 *  
 *  join method() : main method execute all statement one by one 
 *                  so by join method you make sure that no rest of statement will going to 
 *                  execute until this thread is complete their operation.
 *                  
 *    
 * 
 *  How to create Thread using runnable interface 
 *  
 *  1) Thread class constructor is runnable type 
 *     
 *      class A implements Runnable{
 *        
 *          public void run(){
 *            System.out.println("running");
 *          }
 *      }
 *      
 *      main (){
 *       
 *          Thread t1=new Thread(new A);
 *          t1.start();
 *          t1.join();
 *        
 *      }
 *  
 */

class MyThread  extends Thread{
    
	@Override
	public void run() {
		
		for(int i=1;i<=5;i++) {
            System.out.println(i+"Thread is running");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	 
}

public class ThreadExample {
	
	public static void main(String args[]) throws InterruptedException {
		
		MyThread myThread = new MyThread();
		
		myThread.start();
		
		myThread.join();
		
		System.out.println("I am executing 1");
		
		System.out.println("I am executing 2");
		System.out.println("I am executing 3");
		System.out.println("I am executing 4");
		System.out.println("I am executing 5");
		
	}

}
