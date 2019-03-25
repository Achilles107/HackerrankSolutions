import java.util.Scanner;

public class BeautifulTriplets
{
    static void tripling(int n,int d,int arr[])
    {
        int l,r;
        int count=0;
        for(int i=0;i<n-2;i++)
        {
            //fix the first element
            l=i+1;
            r=n-1;   //index of the last element
            //System.out.println(i);
            while(l<r) {
                if (Math.abs(arr[l] - arr[i]) == d && Math.abs(arr[r] - arr[l]) == d) {
                    /*System.out.print("Triplet is " + arr[i] +
                            ", " + arr[l] + ", " + arr[r]);*/
                     count=count+1;
                    break;

                } else if ((arr[l] - arr[i]) != d) {
                    l++;
                } else if ((arr[r] - arr[l]) != d) {
                    r--;
                }
            }
            //System.out.println(i);
        }
        System.out.println(count);

        /*int count=0;
        for (int i = 0; i < n - 2; i++) {

            // Fix the second element as A[j]
            for (int j = i + 1; j < n - 1; j++) {

                // Now look for the third number
                for (int k = j + 1; k < n; k++) {
                    if ((arr[j] - arr[i])==d && (arr[k]-arr[j]) == d) {
                        count=count+1;

                    }
                }
            }
        }*/
        //return count;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        tripling(n,d,arr);
    }
}
