package com.bridgelab;

import java.util.Scanner;
class Leap1
{	
	public void leap(int a)
	{
		if(a>999)
        {
			if(a%400==0)
			{
				System.out.println("It is leap year");
			}
			else if(a%100==0)
			{
				System.out.println("It is not leap year");
			}
			else if(a%4==0)
			{
				System.out.println("It is leap year");
			}
			else
			{
				System.out.println("It is not leap year");
			}
         }
         else
         {
            System.out.println("Enter valid year");
         }
	}
    public static void main(String[] args)
    {
        
        Scanner s = new Scanner(System.in);
        int a;
        System.out.print("Enter the year:");
        a=s.nextInt();
        Leap1 l=new Leap1();
        l.leap(a);
    }
}
