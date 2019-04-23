import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DivisibleSumPair 
{
	static int sumPair(int[] ar,int s,int k)
	{
		int sum;
		int count=0;
		for(int i=s;i<ar.length;i++)
		{
			sum=ar[s];
			if(i!=s)
			{
				sum=sum+ar[i];
				if(sum%k==0)
					count=count+1;
				
				
			}
			
		}
		//System.out.println(count);
		return count;
	}

    static void divisibleSumPairs(int n, int k, int[] ar) 
    {
    	int cnt=0;
        for(int i=0;i<n;i++)
        {
        	cnt=cnt+sumPair(ar,i,k);
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        divisibleSumPairs(n, k, ar);
        //System.out.println(result);
    }
}
