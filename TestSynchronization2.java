import java.util.*;
class Table
{  
 synchronized void printTable()
	{ 
	Scanner s=new Scanner(System.in);
		int n;
	System.out.println("enter the value of n");
	n=Integer.parseInt(s.next());
 	  for(int i=1;i<=10;i++)
		{  
    		 System.out.println(n*i);  
    		 try
			{  
      				Thread.sleep(400);  
    			 }
		catch(Exception e)
			{	
				System.out.println(e);}  
 			  }  
  
		 }  
}  
  
class MyThread1 extends Thread{  
Table t;  

MyThread1(Table t)
{  
	this.t=t;  
}  
public void run()
{  
	
	t.printTable();  
}  
  
}  
class MyThread2 extends Thread
{  
Table t;  

MyThread2(Table t)
{  
	this.t=t;  
}  
public void run()
{  
	t.printTable();  
}  
}  
  class MyThread3 extends Thread
{  
Table t;  

MyThread3(Table t)
{  
	this.t=t;  
}  
public void run()
{  
	t.printTable();  
}  
}  
public class TestSynchronization2{  
public static void main(String args[]){  
Table obj = new Table(); 
MyThread1 t1=new MyThread1(obj);  
MyThread2 t2=new MyThread2(obj);  
MyThread3 t3=new MyThread3(obj);  
t1.start();  
t2.start();  
t3.start();
}  
}  