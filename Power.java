package com.bridgelab;

import java.util.Scanner;
class Power
{	
	public void power(int n)
	{
		int power=1;
		if(n<31)
        {
            for(int i=1;i<=n;i++)
            {
                power = power * 2 ;
                System.out.println("2^"+i+"="+power);
            }
        }
        else
        {
            System.out.println("Enter size below 31");
        }
	}
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the power size upto 30");
        int n=s.nextInt();
        Power p=new Power();
        p.power(n);
    }
}

