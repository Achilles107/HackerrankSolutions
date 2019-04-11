import java.util.Scanner;

public class BeautifulStr 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		String str=sc.next();
		beauty(str,len);
	}

	private static void beauty(String str, int len)
	{
		int idxZ=0,idxO=0,idxT=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.substring(i, i+2).equals("010"))
			{
				str=str.replace(str.charAt(i), '1');
				idxZ++;
				i=0;
			}
			
		}
		
	}

}
