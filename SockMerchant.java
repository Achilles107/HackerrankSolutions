import java.util.*;
public class SockMerchant
{
    static int count(int col[],int val)
    {
        int cnt=0;
        for (int i=0;i<col.length;i++)
        {
            if (val==col[i])
                cnt++;
        }if (cnt>=2)
        {

            return cnt/2;
        }
        else
            return 0;
    }
    static void perSum(int col[])
    {
        int total=0;
        int pair=0;
        HashSet<Integer> hashSet =new HashSet<>();
        for (int i=0;i<col.length;i++)
        {
            if(!hashSet.contains(col[i]))
            {
                hashSet.add(col[i]);
                pair=count(col,col[i]);
                total=total+pair;
                //System.out.println(pair);
            }

        }
        System.out.println(total);
    }
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int colors[]=new int[n];
        for (int i=0;i<n;i++)
        {
            colors[i]= scanner.nextInt();
        }
        perSum(colors);
        //int cnt=count(colors,10);
        //System.out.println(cnt);

    }
}
