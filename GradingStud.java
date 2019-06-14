import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GradingStud {

    static int[] solve(int[] grades)
    {
    	int[] newarr=new int[grades.length];
    	int quot=0,nextMul=0;
    	for(int i=0;i<grades.length;i++)
    	{
    		if(grades[i]>37)
    		{
    			nextMul=((grades[i]/5)+1)*5;
    			if((nextMul-grades[i])<3)
    				newarr[i]=nextMul;
    			else
    				newarr[i]=grades[i];
    			//quot=quot+1;
    			
    			
    		}
    		else
    		{
    			newarr[i]=grades[i];
    		}
    	}
    	return newarr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}

