    import java.util.Scanner;

    public class MinimumDistance
    {
        static int minDist(int n,int arr[])
        {
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(arr[j]==arr[i])
                    {
                        min=Math.min(min,Math.abs(j-i));
                    }
                }
            }
            if(min<Integer.MAX_VALUE)
            {
                return min;
            }
            else
                {
                    return -1;
                }
        }
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println(minDist(n,arr));
        }
    }
