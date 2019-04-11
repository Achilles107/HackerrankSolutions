import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AppleOrange 
{
	static int noOfApples(int[] apples,int s,int t,int a)
	{
		int dist=0,cnt=0;
		for(int i=0;i<apples.length;i++)
		{
			dist=a+apples[i];
			if(dist>=s && dist<=t)
				cnt=cnt+1;
		}
		return cnt;
		
			
	}
	static int noOfOranges(int[] oranges,int s,int t,int b)
	{
		int dist=0,cnt=0;
		for(int i=0;i<oranges.length;i++)
		{
			dist=b+oranges[i];
			if(dist>=s && dist<=t)
				cnt=cnt+1;
		}
		return cnt;
		
			
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int noa,noo;
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        noa=noOfApples(apple,s,t,a);
        noo=noOfOranges(orange,s,t,b);
        System.out.println(noa);
        System.out.println(noo);
    }
}
