package com.bridgelab;
import java.util.*;
public class Stopwatch 
{	
	static long a1=0,a2=0;
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1 to start...");
		int i=s.nextInt();
		if(i==1)
			start();
		else
			System.out.println("Invalid Input");

		System.out.println("Enter 2 to Stop");
		int j=s.nextInt();
		if(j==2&&i==1)
			stop();
		else
			System.out.println("Invalid Input");
		if(i==1&&j==2)
			elapsedTime();
		else
			System.out.println("Not started");
	}
	static void start()
	{
		System.out.println("Started...");
		a1=System.currentTimeMillis();
	}
	static void stop()
	{
		a2=System.currentTimeMillis();
		System.out.println("Stopped...");
	}
	static void elapsedTime()
	{
		System.out.println("Elapsed time between start and stop is: "+(a2-a1));
	}
}
