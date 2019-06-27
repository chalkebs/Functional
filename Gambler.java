package com.bridgelab;
import java.util.*;

public class Gambler 
{
	public static void main(String[] args)
	{
		/*Simulates a gambler who start with $stake and place 
		fair $1 bets until he/she goes broke (i.e. has no money) or reach $goal. 
		Keeps track of the number of times he/she wins and the number of bets he/she makes. 
		Run the experiment N times, averages the results, and prints them out.*/
		
		int stk,gl,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Stake...");
		stk=s.nextInt();
		System.out.println("Enter Goal...");
		gl=s.nextInt();
		System.out.println("Enter Number of times you want to play...");
		n=s.nextInt();
		
		game(stk,gl,n);
	}
	static void game(int stk,int gl, int n)
	{
		int wn=0;
		
		for(int i=0;i<n;i++)
		{
			if(stk>0&&stk<gl)
			{	
				
				if(Math.random()<0.5)
				{
					stk++;
				}
				else
				{
					stk--;
				}
			}
			if(stk==gl)
				wn++;
		}
		System.out.println("wins "+wn+" times out of "+n);
		System.out.println("Wins in percentage: "+(100*wn/n)+"%");
		System.out.println("Loss in percentage: "+(100*(n-wn)/n)+"%");
	}
}

