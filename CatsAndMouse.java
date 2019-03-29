import java.util.*;
public class CatsAndMouse
{
    void catOrMouse(int a,int b,int c)
    {
        int diffa=Math.abs(c-a);
        int diffb=Math.abs(c-b);
        if (diffa<diffb)
        {
            System.out.println("Cat A");
        }
        else if(diffa>diffb)
        {
            System.out.println("Cat B");
        }
        else
            {
                System.out.println("Mouse C");
            }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        for(int i=0;i<q;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            CatsAndMouse catsAndMouse=new CatsAndMouse();
            catsAndMouse.catOrMouse(a,b,c);
        }

    }
}
