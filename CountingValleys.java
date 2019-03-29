import java.util.*;
public class CountingValleys
{
    static void counter(int sL)
    {
        int cnt=0;
        if (sL==0)
        {
            cnt=cnt+1;
        }
        System.out.println(cnt);
    }
    static void valleyCounter(String steps)
    {
        char[] starr=steps.toCharArray();
        int cU=0,cD=0;
        int sL=0,m=0,v=0;
        for(int i=0;i<starr.length;i++)
        {
            //System.out.println(starr[i]);
            if (starr[i]=='U')
            {
                if (sL<0)
                {
                    sL=sL+1;
                    if (sL==0)
                    {
                        v=v+1;
                        //counter(sL);
                    }
                }
                else
                    {
                        sL=sL+1;
                    }


            }
            else if(starr[i]=='D')
            {
                sL=sL-1;
                /*if (sL==0)
                {
                    v=v+1;
                    //counter(sL);
                }*/
            }

        }
        System.out.println(v);


    }
    public static void main(String args[])
    {
        double nos;
        String steps;
        Scanner sc=new Scanner(System.in);
        nos=sc.nextDouble();
        sc.nextLine();
        steps=sc.nextLine();
        if(steps.length()==nos)
            valleyCounter(steps);
    }
}
