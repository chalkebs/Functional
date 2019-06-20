package com.bridgelab;

import java.util.Scanner;
class Harmonic
{	
	public void harmonic(int a)
	{
		double sum1=1.0;
        double sum2=1.0;
        double o,p,q,t;
        for(int i=2;i<=a;i++)
        {
            o=1.0;
            p=(double)i;
            q=(sum1*p)+(o*sum2);
            t=p*sum2;
            sum1=q;
            sum2=t; 
            
        }
        sum1=(int)sum1;
        sum2=(int)sum2; 
        if(sum1>sum2)
        {
            for(int i=1;i<=sum1;i++)
            {
                if(sum1%i==0&&sum2%i==0)
                {
                    sum1=sum1/i;
                    sum2=sum2/i;
                }
            }
        }
        else
        {
            for(int i=1;i<=sum2;i++)
            {
                if(sum1%i==0&&sum2%i==0)
                {
                    sum1=sum1/i;
                    sum2=sum2/i;
                }
            }

        }
        int r=(int)sum1;
        int u=(int)sum2;
        System.out.println(r+"/"+u);

	}
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a=0;
    
        System.out.print("Enter the harmonic number:");
        a=s.nextInt();
    
        Harmonic h=new Harmonic();
        h.harmonic(a);
        
    }
}



