package abc1;

public class Permutation {
	
	public static void main(String[] args)
	{	
		String s = "ABC";
		permutationItera("", s);
		System.out.println();
		permutationRecur(s.toCharArray(), 0);
	}

	public static void permutationItera(String a, String b)
	{	
		if (b.length() == 0) {
			System.out.println(a);
		}

		for (int i = 0; i < b.length(); i++)
		{
			String na = a + b.charAt(i);

			String nb = b.substring(0, i) + b.substring(i + 1);

			permutationItera(na, nb);
		}
	}

	public static void permutationRecur(char[] c,int ci)
	{
		if (ci == c.length - 1) {
			System.out.println(String.valueOf(c));
		}

		for (int i = ci; i < c.length; i++)
		{
			swap(c, ci, i);
			permutationRecur(c, ci + 1);
			swap(c, ci, i);
		}
	}
	
	public static void swap(char[] c, int ci, int i)
	{	
		char temp=c[ci];
		c[ci]=c[i];
		c[i]=temp;
	}
}
