import java.util.Scanner;

public class FunnyString
{
    static void funnyOrNot(String str)
    {
        String strRev=new StringBuilder(str).reverse().toString();
        int arr[]=new int[str.length()];
        int arr2[]=new int[strRev.length()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=(int)str.charAt(i);
            arr2[i]=(int)strRev.charAt(i);
        }
        int res[]=new int[arr.length-1];
        int resRev[]=new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++)
        {
            res[i]=Math.abs(arr[i]-arr[i+1]);
            resRev[i]=Math.abs(arr2[i]-arr2[i+1]);
            if(res[i]!=resRev[i])
            {
                System.out.println("Not Funny");
                return;
            }
        }
        System.out.println("Funny");
    }
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int q=scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<q;i++)
        {
            String str=scanner.nextLine();
            funnyOrNot(str);

        }
    }
}
