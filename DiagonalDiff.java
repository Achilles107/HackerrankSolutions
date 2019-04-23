import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDiff
{
    public int sumDia(int[][] ar,int n)
    {
    	int sumPrimary=0;
    	int sumSecondary=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
            	if(i==j)
            		sumPrimary=sumPrimary+ar[i][j];
            	if(i==n-j-1)//secondary diagonal
            		sumSecondary=sumSecondary+ar[i][j];
            }
        }
        int diff=Math.abs(sumPrimary-sumSecondary);
        return diff;
    }

    public static void main(String[] args) 
    {
    	DiagonalDiff dd=new DiagonalDiff();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result=dd.sumDia(a, n);
        System.out.println(result);
    }
}
