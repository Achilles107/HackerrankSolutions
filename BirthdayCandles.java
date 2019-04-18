import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCandles 
{
	static int birthdayCakeCandles(int n, int[] ar) 
	{
		Arrays.sort(ar);
		int cnt=0;
		for(int i=0;i<n;i++)
		{
			if(ar[i]==ar[n-1])
				cnt=cnt+1;
		}
		return cnt;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] ar = new int[n];
	        for(int ar_i = 0; ar_i < n; ar_i++){
	            ar[ar_i] = in.nextInt();
	        }
	        int result = birthdayCakeCandles(n, ar);
	        System.out.println(result);
	   

	}

}
