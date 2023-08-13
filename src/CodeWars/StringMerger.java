package CodeWars;

public class StringMerger {

	public static void main(String[] args) {
					
		String s = "Can we merge it? Yes, we can!";
		String part1 = "a wemeet?Ye, !";
		String part2 = "Cn rg i swe can";
		System.out.println(isMerge(s, part1, part2));
	}
	public static boolean isMerge(String s, String part1, String part2)
	{
		if (part1 == part2 & !s.isEmpty())
		{
			return false;
		}
		char[] ch = s.toCharArray();
		char[] p1 = part1.toCharArray();
		char[] p2 = part2.toCharArray();
		int l = ch.length, l1 = p1.length, l2 = p2.length;
		int n = 0, m = 0;
		if (l == (l1 + l2))
		{
			for (int i = 0; i < l; i++)
			{
				if (n < l1 && ch[i] == p1[n])
				{
					n++;
				}	
				if (m < l2 && ch[i] == p2[m])
				{
					m++;
				}	
			}
			if (l == n + m)
			{
				return true;
			} 
			else
			{
				return false;
			}
		} 
		else
		{
			return false;
		}	
	}
}
