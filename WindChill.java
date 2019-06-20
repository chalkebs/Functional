package com.bridgelab;

import java.util.Scanner;
class WindChill
{
	public void windchill(double t, double v)
	{
		 double windchill;
		 if(t>50 && v>120 && v<3)
	        {
	            System.out.print("Enter the temperture below of 50 and velocity between 3 to 120");
	        }
	        else
	        {
	            //double o=(double)t;
	            //double p=(double)v;
	            windchill=35.74+(0.6215*t)+((0.4275*t)-35.75)*(Math.pow(v,0.16));
	            System.out.println("WindChill is: "+windchill);
	        }
	}
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        double t,v;
        System.out.print("Enter Temperature in farenheit:");
        t=s.nextDouble();
        System.out.print("Enter velocity of wind in miles:");
        v=s.nextDouble();
        WindChill w=new WindChill();
        w.windchill(t,v);

    }
}

