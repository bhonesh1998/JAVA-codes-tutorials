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

// a java program to show multiple inheritance 

class google
{
	void android()
	{
		System.out.println("android devlop....");
	}


}

class sm extends google
{
	void java()
	{
		System.out.println("java prog...");
	}


}


class ora extends google
{
	void sql()
	{
		System.out.println("struct prog...");
	}
	
	public static void main(String args[])
	{
		ora obj=new ora();
		sm obj=new sm();
		obj.sql();
		obj.java();
		obj.android();
	}


}
