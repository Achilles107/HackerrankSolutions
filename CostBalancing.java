import java.util.HashMap;
import java.util.Scanner;
public class CostBalancing 
{
	public static void main(String args[])
	{
		int not,nof,c=0;
		Scanner sc=new Scanner(System.in);
		not=sc.nextInt();
		nof=sc.nextInt();
		HashMap<Integer,Float> hm=new HashMap<Integer,Float>();
		HashMap<Integer,Float> hm1=new HashMap<Integer,Float>();
		for(int i=0;i<not;i++)
		{
			hm.put(sc.nextInt(), sc.nextFloat());
		}
		for(int i=1;i<=nof;i++)
		{
			if(hm.containsKey(i))
			{
			  c=c+1;
			}
		}
		if(c==nof)
		{
			System.out.println(hm.get(1));
			
		}
	}

}
