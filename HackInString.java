import java.util.Scanner;

public class HackInString 
{
	
	static void hackString(String str)
	{
		int count=0;
		String hackerrank="hackerrank";
		char[] ch=hackerrank.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(str.contains(ch[i]+""))
			{
				count++;
				str=str.substring(str.indexOf(ch[i])+1, str.length());
			}
		}
		if(count==hackerrank.length())
			System.out.println("YES");
		else
			System.out.println("NO");
		/*System.out.println(hackerrank.length());
		System.out.println(count);*/
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		for(int i=0;i<q;i++)
		{
			String s=sc.next();
			hackString(s);
			
		}
	}

}
