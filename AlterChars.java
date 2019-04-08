import java.util.Scanner;

public class AlterChars 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			String s=sc.next();
			int res=alterChars(s);
			System.out.println(res);
		}
	}

	private static int alterChars(String s) 
	{
		int del=0;
		//char[] arr=s.toCharArray();
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				del++;
			}
			
		}
		
		
		return del;
	}

}
