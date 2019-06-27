package bridgelab;

public class Coupon {
	public static void coupon(int a,int c,int d, boolean[] b)
	{
		while(d<a)
		{
			int e=(int)(Math.random()*a);
			c++;
			if(!b[e])
			{
				d++;
				b[e]=true;
			}
		}
		System.out.println("Total random no. are: "+c);
	}
	public static void main(String[] args)
	{	
		System.out.println("Coupon value...");
		int a=Integer.parseInt(args[0]);
		boolean[] b=new boolean[a];
		int c=0,d=0; //c:count and d:discount
		coupon(a,c,d,b);
	}
}
