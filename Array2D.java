package com.bridgelab;
import java.util.Scanner;
import java.io.PrintWriter;
public class Array2D 
{	
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter row size of array");
		int r=s.nextInt();
		System.out.println("Enter column size of array");
		int c=s.nextInt();
		
		int[][] i = new int[r][c];
		double[][] d = new double[r][c];
		String[][] b =new String[r][c];
		
		i=IpIntArray(i,r,c);
		d=IpDoubleArray(d,r,c);
		b=IpBooleanArray(b,r,c);
		
		printArray(i,d,b,r,c);
	}
	public static int[][] IpIntArray(int[][] i,int r,int c)
	{	
		System.out.println("Enter Integer elements for array...");
		for(int j=0;j<r;j++)
		{
			for(int k=0;k<c;k++)
			{
				i[j][k]=s.nextInt();
			}
		}
		return i;
	}
	public static double[][] IpDoubleArray(double[][] d,int r,int c)
	{
		System.out.println("Enter double elements for array...");
		for(int j=0;j<r;j++)
		{
			for(int k=0;k<c;k++)
			{
				d[j][k]=s.nextDouble();
			}
		}
		return d;
	}
	public static String[][] IpBooleanArray(String[][] b,int r,int c)
	{
		System.out.println("Enter boolean elements for array...");
		for(int j=0;j<r;j++)
		{
			for(int k=0;k<c;k++)
			{
				b[j][k]=s.nextLine();
			}
		}
		return b;
	}
	public static void printArray(int[][] i,double[][] d,String[][] b,int r,int c)
	{
		PrintWriter pw = new PrintWriter(System.out,true);

		pw.println("Integer Array...");

		for (int j=0; j<r; j++) {
			for (int k=0; k<c; k++) {
				pw.print(" "+i[j][k]);
			}
			pw.println("\n");
		}
		
		pw.println("Double Array...");

		for (int j=0; j<r; j++) {
			for (int k=0; k<c; k++) {
				pw.print(" "+d[j][k]);
			}
			pw.println("\n");
		}
		
		pw.println("Boolean Array...");

		for (int j=0; j<r; j++) {
			for (int k=0; k<c; k++) {
				pw.print(" "+b[j][k]);
			}
			pw.println("\n");
		}
	}
}
