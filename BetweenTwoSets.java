import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BetweenTwoSets {

    static int getTotalX(int[] a, int[] b)
    {
    	int len=(b[0]-a[a.length-1])+2;
    	int[] newarr=new int[len-1];
    	int no=0,cnt=0,cntAg=0,flag=0,count=0;
    	int newar=a[a.length-1]-1;
    	//System.out.println(b.length);
        if(a[a.length-1]!=b[0])
        {
        	for(int i=0;i<newarr.length;i++)
            {
            		newarr[i]=newar+1;
            		newar=newar+1;
            		if(newarr[i]==b[0])
            			break;
            }
        }
        for(int i=0;i<newarr.length;i++)
        {
        	for(int j=0;j<b.length;j++)
        	{
        		if(b[j]%newarr[i]==0)
        		{
        			cnt=cnt+1;        			
        		}
        		
        	} 
        	if(cnt==b.length)
        	{
        		//no=newarr[i];
        		for(int k=0;k<a.length;k++)
        		{
        			if(newarr[i]%a[k]==0)
        			{
        				cntAg=cntAg+1;
                	}
        		}
        		if(cntAg==a.length)
        		{
        			flag=1;
        			count=count+1;
        			cntAg=0;
        			//no=newarr[i];
        			//System.out.println(count+" "+no+" "+flag);
        		}
        		cnt=0;
        		
        	}
        	else
        	{
        		cnt=0;
        	}
        	
        	
        } 
      if(flag==1)
    	  count=count;
        return count;
        }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
    }
}

