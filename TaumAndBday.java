import java.util.Scanner;

public class TaumAndBday
{
    static int minUnits(int b,int w,int bc,int wc,int z)
    {
        int cb=b*bc;
        int cw=w*wc;
        int unit=cb+cw;
        if(unit>(cb+(w*(bc+z))))
        {
            unit=(cb+(w*(bc+z)));
        }
        if(unit>(cw+(b*(wc+z))))
        {
            unit=(cw+(b*(wc+z)));
        }
        return (int)Math.min(Math.min((long)b * (long)bc + (long)w * (long)wc, (long)b * (long)bc + (long)w * (long)(bc+z)), (long)b * (long)(wc+z) + (long)w * (long)wc);

        /*if(cb>cw)
        {
            if(bc>(wc+z))
            {
                cb=b*(wc+z);
            }
        }
        else if(cw>cb)
        {
            if(wc>(bc+z))
            {
                cw=w*(bc+z);
            }
        }
        else
            {
                if(bc>(wc+z))
                {
                    cb=b*(wc+z);
                }
                else if(wc>(bc+z))
                {
                    cw=w*(bc+z);
                }
            }*/
        //return cb+cw;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int testCases=sc.nextInt();
        int b,w,bc,wc,z;
        while(testCases>0)
        {
            b=sc.nextInt();
            w=sc.nextInt();
            bc=sc.nextInt();
            wc=sc.nextInt();
            z=sc.nextInt();
            System.out.println(minUnits(b,w,bc,wc,z));
            testCases--;
        }
    }
}
