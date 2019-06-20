package com.bridgelab;

import java.util.Scanner;
class Factors
{
	public void PrimeFactors(int a)
	{	
		int j=0,i,k,l=0,c=0;
        int b[]=new int[100];
		System.out.println("Factors are:");            
        for(i=1;i<=a;i++)
        {
                if(a%i==0)
                {
                    b[j]=i;
                   System.out.println(b[j]);
                    j++;    
                }
         }
         System.out.println("Prime Factors are:");
         System.out.println("2");
         for(l=0;l<j;l++)
         {
                for(k=2;k<b[l];k++)
                {
                    if(b[l]%k==0)
                    {
                        c=0;
                        break;
                    }
                    else
                    {
                        c=1;
                    }
                }
                if(c==1)
                {
                    System.out.println(b[l]+"");
                }
          }
	}
	
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a;

        System.out.println("Enter the Number:");
        a=s.nextInt();
        
        Factors f=new Factors();
        f.PrimeFactors(a);
        
        
    }
}
