import java.util.Scanner;

public class FindDigits {

	static void findDigits(int n)
	{
		String s=""+n;
		int[] arr=new int[s.length()];
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			arr[i]=Integer.parseInt(""+ch[i]);
		}
		int c=0;
		for(int i=0;i<ch.length;i++)
			if(arr[i]!=0)
			{
				{
				if(n%arr[i]==0)
				{
					c=c+1;
				}
			}
		}
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int testCases=sc.nextInt();
		for(int i=0;i<testCases;i++)
		{
			int num=sc.nextInt();
			findDigits(num);
		}
		// TODO Auto-generated method stub

	}

}
