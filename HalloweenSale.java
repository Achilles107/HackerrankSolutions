    import java.util.Scanner;
    public class HalloweenSale
    {
        static int sale(int p,int d,int m,int s)
        {
            int rem=0;
            int val=0;
            int nog=0;
            if(p<=s)
            {
                while(p>m)
                {
                    val=val+p;
                    p=p-d;

                    nog = nog + 1;
                    if(val>s)
                    {
                        return nog-1;
                    }

                }
                p=m;
                rem=(Math.abs(s-val))/m;
            }
            return nog+rem;
        }
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int p=sc.nextInt();
            int d=sc.nextInt();
            int m=sc.nextInt();
            int s=sc.nextInt();
            System.out.println(sale(p,d,m,s));
        }
    }
