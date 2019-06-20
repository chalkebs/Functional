package com.bridgelab;
import java.util.Scanner;
class Quadratic
{	
	public void quadratic(int a, int b, int c)
	{
		double x;
		double delta = (double)(b*b - 4*a*c);
        //Root 1 of x = (-b + sqrt(delta))/(2*a)
        //Root 2 of x = (-b - sqrt(delta))/(2*a)
        System.out.println("Roots of equation:");
        x=(-b+(Math.sqrt(delta)))/(2*a);
        
        System.out.println("Root1:\t"+x);
        x=(-b-(Math.sqrt(delta)))/(2*a);
        
       System.out.println("Root2:\t"+x);
	}
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the values of a, b & c");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        System.out.println(a+"x^2+"+b+"x+"+c);
        Quadratic q=new Quadratic();
        q.quadratic(a,b,c);
    }
}