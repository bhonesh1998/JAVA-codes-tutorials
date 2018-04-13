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

// a java program to show parameterized constructor and non parameterized constructor

class APTRON
{
	APTRON()
	{
		System.out.println("non para ..cons");
	}


	APTRON(int x)
	{
		System.out.println("para ..cons");
	}
	

	public static void main(String args[])
	{
		APTRON obj=new APTRON();
		APTRON obj2=new APTRON(10);

	}









}
