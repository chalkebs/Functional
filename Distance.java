package com.bridgelab;

//Write a program Distance.java 
//that takes two integer command-line arguments x and y 
//and prints the Euclidean distance from the point (x, y) to the origin (0, 0).
//The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function

import java.util.Scanner;
class Distance
{	
	public void distance(double a,double b,double c,double d)
	{
		double Ecludian=Math.sqrt((Math.pow((b-a), 2))+(Math.pow((d-c), 2)));
        System.out.println("Ecludian distance of\t"+b+"\t&\t"+d+"\tis:\t"+Ecludian);
	}
	
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        double x1=0,y1=0,x2,y2;
        System.out.println("Enter two points for calculating Ecludian dist");
        x2=s.nextDouble();
        y2=s.nextDouble();
        Distance d=new Distance();
        d.distance(x1,x2,y1,y2);
        
    }
}
