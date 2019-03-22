import java.util.Scanner;

public class LoveLetterMystery
{
    static int mystery(String str)
    {
        String revStr=new StringBuilder(str).reverse().toString();
        int len=revStr.length();
        int c=len/2;
        //System.out.println(c);
        int total=0;
        if(str.length()%2!=0) {
          //  System.out.println("1");
            for (int i = c + 1; i < len; i++) {
                //System.out.println("1");
                total = total + (Math.abs((int) str.charAt(i) - (int) revStr.charAt(i)));
            }
        }
        else
            {
                for (int i = c; i < len; i++) {
                   // System.out.println("2");
                    total = total + (Math.abs((int) str.charAt(i) - (int) revStr.charAt(i)));
                }
            }
            return total;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String letters = sc.nextLine();
            System.out.println(mystery(letters));
        }
    }
}
