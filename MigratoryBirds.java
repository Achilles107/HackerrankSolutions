import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class MigratoryBirds
{
    static void countBirds(int arr[],int n)
    {
        int count = 0,max=Integer.MIN_VALUE,maxKey=0;
        TreeMap<Integer,Integer> map=new TreeMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(Integer i:arr)
        {
            if(map.containsKey(i))
            {
                count=map.get(i);
                count=count +1;
            }
            else
                {
                    count = 1;
                }
                if(max<=count)
                {
                    max=count;
                    maxKey=i;

                }
            map.put(i,count);
        }
        System.out.println(maxKey);


        //System.out.println(map);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        countBirds(arr,n);
    }
}
