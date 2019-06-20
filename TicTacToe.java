import java.util.*;
public class TicTacToe {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		int m,r=1,i,j;
		String x="1";
		int x1 = Integer.parseInt(x);
		String o="0";
		int o1 = Integer.parseInt(o);
		
		System.out.println("Enter no of row and columns");
		m=s.nextInt();
		int[][] a=new int[m][m];
		for(i=0;i<m;i++)
		{
			System.out.println("--------------");
			System.out.print(" | ");
			for(j=0;j<m;j++)
			{
				a[i][j]=r;
				System.out.print(a[i][j]);
				System.out.print(" | ");
				r++;
			}
			System.out.print("\n");
		}
		System.out.println("---------------");
	
				for(int k=0;k<m*m;k++)
				{
				  System.out.println("Enter choice");
				  int n=s.nextInt();
				 switch(n)
				 {
				    case 1:
				System.out.println("Enter position for x");
					r=s.nextInt();
					System.out.println("insert X at position "+r);
					for(i=0;i<m;i++)
					{
						for(j=0;j<m;j++)
						{
							if(a[i][j]==r)
							{
								a[i][j]=x1;
								
							}
						}
					}
					for(i=0;i<m;i++)
		{
			System.out.println("--------------");
			System.out.print(" | ");
			for(j=0;j<m;j++)
			{
				System.out.print(a[i][j]);
				System.out.print(" | ");
			}
			System.out.print("\n");
		}
		System.out.println("---------------");
					break;
					case 2:
					System.out.println("Enter position for o");
					r=s.nextInt();
					System.out.println("insert O at position "+r);
					for(i=0;i<m;i++)
					{
						for(j=0;j<m;j++)
						{
							if(a[i][j]==r)
							{
								a[i][j]=o1;
								
							}
						}
					}
					for(i=0;i<m;i++)
		{
			System.out.println("--------------");
			System.out.print(" | ");
			for(j=0;j<m;j++)
			{
				System.out.print(a[i][j]);
				System.out.print(" | ");
			}
			System.out.print("\n");
		}
		System.out.println("---------------");
					break;
					}
					if((a[0][0]==1&&a[0][1]==1&&a[0][2]==1)||
					    (a[1][0]==1&&a[1][1]==1&&a[1][2]==1)||
					    (a[2][0]==1&&a[1][1]==1&&a[2][2]==1)||
					    (a[0][0]==1&&a[1][0]==1&&a[2][0]==1)||
					    (a[0][1]==1&&a[1][1]==1&&a[2][1]==1)||
					    (a[0][2]==1&&a[1][2]==1&&a[2][2]==1)||
					    (a[0][0]==1&&a[1][1]==1&&a[2][2]==1)||
					    (a[0][2]==1&&a[1][1]==1&&a[2][0]==1))
					    {
					        System.out.println("Player 1 is winner");
					        break;
					    }
					    else if((a[0][0]==0&&a[0][1]==0&&a[0][2]==0)||
					            (a[1][0]==0&&a[1][1]==0&&a[1][2]==0)||
					            (a[2][0]==0&&a[1][1]==0&&a[2][2]==0)||
					            (a[0][0]==0&&a[1][0]==0&&a[2][0]==0)||
					            (a[0][1]==0&&a[1][1]==0&&a[2][1]==0)||
					            (a[0][2]==0&&a[1][2]==0&&a[2][2]==0)||
					            (a[0][0]==0&&a[1][1]==0&&a[2][2]==0)||
					            (a[0][2]==0&&a[1][1]==0&&a[2][0]==0))
					            {
					               System.out.println("Player 2 is winner"); 
					               break;
					            }
					            else
					            {
					                System.out.println("Draw..........."); 
					            }
					           
			           } 
					            
				}

	
		
	}
