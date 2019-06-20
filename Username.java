package com.bridgelab;

import java.util.Scanner;

class Username
{	
	public void username(String a)
	{
		int b=a.length();
        if(b<3)
        {
            System.out.println("Username should have min 3 characters");
        }
        else{
            System.out.println("Hello "+a+",How are you?");
        }
	}
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter username:");
        String a=s.nextLine();
        Username u=new Username();
        u.username(a);
        
    }
}
