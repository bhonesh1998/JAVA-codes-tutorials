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

// a java program to show exception handling using try catch 

// exception can be handled in catch block
// remember one thing finally block will always be executed 

import java.util.*;
class trycatch
{
	void f1()
	{	try
		{Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 value");
		int x=sc.nextInt();
		System.out.println("enter 2 value");
		int y=sc.nextInt();
		int z=x/y;
		System.out.println("try block....division"+z);
		}
		catch(Exception ae)
		{	System.out.println("catch block...problem occurs..");
		}
		finally
		{
			System.out.println("final block...no impact either exp occurs or not");
		}
	}
	void f2()
	{
		System.out.println("this is second function");
		
	}

	public static void main(String a[])
	{
		trycatch o=new trycatch();
		o.f1();
		o.f2();
	}
}
