import java.util.*;

import static java.lang.StrictMath.pow;

public class PickingNumbers
{
    static void printSubsets(int set[])
    {
        int n = set.length;
        Double d=new Double(Math.pow(set.length,2));
        int size=d.intValue();
        String[] str=new String[size];
        String string="";
        // Run a loop for printing all 2^n
        // subsets one by obe
        for (int i = 0; i < (1<<n); i++)
        {
            //System.out.print("{ ");
            //string=string+"{";

            // Print current subset
            for (int j = 0; j < n; j++)

                // (1<<j) is a number with jth bit 1
                // so when we 'and' them with the
                // subset number we get which numbers
                // are present in the subset and which
                // are not
                if ((i & (1 << j)) > 0)
                {
                    string=string+set[j];
                }
                    //System.out.print(set[j] + " ");
            //string=string+"}";
            System.out.println(string);
            string="";
        }
    }
    public static void main(String args[])
    {
        int set[]={4,6,5,3,3,1};
        printSubsets(set);
    }
}
