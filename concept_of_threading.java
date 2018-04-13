/*
***********************************************************
***********************************************************

NAME-BHONESH CHAWLA
REGNO-20164017
BATCH-CS-1
CONTACT-+918619127663
EMAIL-rajachawla778@gmail.com
***********************************************************
***********************************************************
*/

// a java program to show threading

import java.util.*;
class thread extends Thread // we have to extend Thread class
{
	public void run() 
		{	
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter value of terms");
			int x=sc.nextInt();
			
// user will give an input and program will run thread till x/2 with delay of 500 ms. and for x/2 to x with delay of 1000 ms.

			try
			{		for(int i=1;i<x/2;i++)
				{
					System.out.println(i);
					sleep(500);
				}
				for(int i=x/2;i<x;i++)
				{
					System.out.println(i);
					sleep(1000);
				}	
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
		public static void main(String a[])
		{
			thread obj=new thread();
			obj.start();
			
		}
		

}
