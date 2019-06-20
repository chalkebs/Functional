package com.bridgelab;

import java.util.Scanner;
class Flip
{	
	public void flip(int a)
	{
		double h=0,t=0,i,b,c;
		for(i=0;i<a;i++)
        {
            if(Math.random()<0.5)
            {
                h++;
            }
            else
            {
                t++;
            }
        }
        b=(h/a)*100;
        c=(t/a)*100;
        System.out.println("Heads="+b+"%");
        System.out.println("Tails="+c+"%");
	}
	
    public static void main(String[] args)
    {
        
        Scanner s = new Scanner(System.in);
        int a;
        System.out.println("Enter how many times you want to flip the coin:");
        a=s.nextInt();
        Flip f= new Flip();
        f.flip(a);
  
    }
}
