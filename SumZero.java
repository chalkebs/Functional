package com.bridgelab;

import java.util.Scanner;
class SumZero
{	
	public void sumzero(int n,int a[])
	{
		int i,j,k,c=0;
        for(i=0;i<n-2;i++)
        {
            for(j=i+1;j<n-1;j++)
            {
                 for(k=j+1;k<n;k++)
                 {
                    if(a[i]!=a[j] && a[j]!=a[k] && a[i]!=a[k])
                    {
                        if(a[i]+a[j]+a[k]==0)
                        {
                            System.out.println("Elements are:"+a[i]+","+a[j]+","+a[k]);
                            c++;
                        }
                    
                    }
                 }
            }
        }
        if(c!=0)
        {
        System.out.println("Total "+c+" triplets are consist.");
        }
        else{
            System.out.println("No triplets are exist.");
        }
        
	}
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.print("Enter number of elements:");
        n=s.nextInt();
        int a[]=new int[n];
        System.out.print("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        SumZero z=new SumZero();
        z.sumzero(n,a);
    }
}
