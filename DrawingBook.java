import java.util.*;
import java.lang.Number;
public class DrawingBook
{
    static void pageTurns(double n,double p)
    {
        double fp=1,lp=n;
        double tFrom1=0d;
        double tFromLast=0d;
        if (p==fp || p==lp)
        {
            tFrom1=0;
            tFromLast=0;
        }
        else
            {
                if (p%2==0)
                {
                    if(n%2==0)
                    {
                        tFrom1=p/2;
                        tFromLast=Math.ceil((n-p)/2.0);
                    }
                    else
                        {
                            tFrom1=p/2;
                            tFromLast=Math.floor((n-p)/2);

                        }
                }
                else
                    {
                        if (n%2==0)
                        {
                            tFrom1=(p-1)/2;
                            //System.out.println((n-p)/2);
                            tFromLast=Math.ceil((n-p)/2);
                        }
                        else
                            {
                                tFrom1=(p-1)/2;
                                tFromLast=Math.floor((n-p)/2);
                            }
                    }
            }

            if (tFrom1<tFromLast)
            {
                Double d=new Double(tFrom1);
                System.out.println(d.intValue());
            }

        else
            {
                Double d=new Double(tFromLast);
                System.out.println(d.intValue());
            }


    }
    public  static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        double n=scanner.nextDouble();
        double p=scanner.nextDouble();
        pageTurns(n,p);

    }
}
