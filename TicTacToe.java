import java.util.*;
public class TicTacToe {
	
	public void tic()
	{	
		Scanner s=new Scanner(System.in);
		int i,j;
		char r='A';
		char x='X';
		char o='O';
		char[][] a=new char[3][3];
		for(i=0;i<3;i++)
		{
			System.out.println("--------------");
			System.out.print(" | ");
			for(j=0;j<3;j++)
			{
				a[i][j]=r;
				System.out.print(a[i][j]);
				System.out.print(" | ");
				r++;
			}
			System.out.print("\n");
		}
		System.out.println("---------------");
	
				for(int k=0;k<9;k++)
				{
					
				  System.out.println("Enter choice '1' for player 1 and '2' for player 2 ");
				  int n=s.nextInt();
				 switch(n)
				 {
					case 1:
					System.out.println("Player 1's Turn");
				System.out.println("Enter position for x");
					r= s.next().charAt(0);
					System.out.println("insert X at position "+r);
					for(i=0;i<3;i++)
					{
						for(j=0;j<3;j++)
						{
							if(a[i][j]==r)
							{
								a[i][j]=x;
								
							}
						}
					}
					for(i=0;i<3;i++)
		{
			System.out.println("--------------");
			System.out.print(" | ");
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]);
				System.out.print(" | ");
			}
			System.out.print("\n");
		}
		System.out.println("---------------");
		
					break;
					case 2:
					System.out.println("Player 2's Turn");
					System.out.println("Enter position for o");
					r=s.next().charAt(0);
					System.out.println("insert O at position "+r);
					for(i=0;i<3;i++)
					{
						for(j=0;j<3;j++)
						{
							if(a[i][j]==r)
							{
								a[i][j]=o;
								
							}
						}
					}
					for(i=0;i<3;i++)
		{
			System.out.println("--------------");
			System.out.print(" | ");
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]);
				System.out.print(" | ");
			}
			System.out.print("\n");
		}
		System.out.println("---------------");
					break;
					}
					if((a[0][0]=='X'&&a[0][1]=='X'&&a[0][2]=='X')||
					    (a[1][0]=='X'&&a[1][1]=='X'&&a[1][2]=='X')||
					    (a[2][0]=='X'&&a[1][1]=='X'&&a[2][2]=='X')||
					    (a[0][0]=='X'&&a[1][0]=='X'&&a[2][0]=='X')||
						(a[0][1]=='X'&&a[1][1]=='X'&&a[2][1]=='X')||
					    (a[0][2]=='X'&&a[1][2]=='X'&&a[2][2]=='X')||
					    (a[0][0]=='X'&&a[1][1]=='X'&&a[2][2]=='X')||
					    (a[0][2]=='X'&&a[1][1]=='X'&&a[2][0]=='X'))
					    {
					        System.out.println("Player 1 is winner");
					        break;
					    }
					    else if((a[0][0]=='O'&&a[0][1]=='O'&&a[0][2]=='O')||
					            (a[1][0]=='O'&&a[1][1]=='O'&&a[1][2]=='O')||
					            (a[2][0]=='O'&&a[1][1]=='O'&&a[2][2]=='O')||
					            (a[0][0]=='O'&&a[1][0]=='O'&&a[2][0]=='O')||
					            (a[0][1]=='O'&&a[1][1]=='O'&&a[2][1]=='O')||
					            (a[0][2]=='O'&&a[1][2]=='O'&&a[2][2]=='O')||
					            (a[0][0]=='O'&&a[1][1]=='O'&&a[2][2]=='O')||
					            (a[0][2]=='O'&&a[1][1]=='O'&&a[2][0]=='O'))
					            {
					               System.out.println("Player 2 is winner"); 
					               break;
					            }
					           
			           } 
					         
	}
	public static void main(String[]args)
	{
		System.out.println("Welcome to the TicTacToe World...... ");
		TicTacToe t=new TicTacToe();
		t.tic();   
	}
}
