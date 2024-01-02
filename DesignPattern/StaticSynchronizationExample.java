package com.test;

class SeatBook{
	
	private static Integer  seat=20;	
	
	public synchronized static void bookSeat(Integer s) {	
	      
		  if(seat>=s) {
			    System.out.println("Seat booked successfully :"+s);
				seat=seat-s;
				System.out.println("Total seat left :"+seat);
			
	    }			
	}	
}

class MyThread extends Thread{
	
	private SeatBook book;
	
	private Integer  seat;
	
	public MyThread(SeatBook book,Integer seat) {
		this.book=book;
		this.seat=seat;	
	}
	
	@Override
	public void run() {
		book.bookSeat(this.seat);		
	}
	
}



public class StaticSynchronizationExample {
	public static void main(String args[]) {
		
		SeatBook book=new SeatBook();		
		MyThread  t1=new MyThread(book, 5);
		MyThread  t2=new MyThread(book, 5);
		SeatBook book2=new SeatBook();	
		MyThread  t3=new MyThread(book2, 5);
		MyThread  t4=new MyThread(book2, 15);
		
		
		
		t1.start();
		t2.start();		
		t3.start();
		t4.start();
	}
}
