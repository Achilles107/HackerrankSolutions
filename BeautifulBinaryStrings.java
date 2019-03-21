import java.util.Scanner;

public class BeautifulBinaryStrings
{
    static void noOfSteps(String str)
    {
        int count=0,i=0;
        while(i<str.length())
        {
            if(i+3<=str.length()){
            if(str.substring(i,i+3).equals("010"))
            {
                if((i+5<str.length()) && str.substring(i+2,i+5).equals("010"))
                {
                    //System.out.println("1");
                    count=count+1;
                    i=i+4;
                }
                else
                    {
                       //System.out.println("2");
                        count=count+1;
                        i=i+2;
                    }
            }
            else

            {
                i++;
            }
            }
            else {
                i++;
            }
        }
        System.out.println(count);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String str=sc.nextLine();
        noOfSteps(str);
    }
}
