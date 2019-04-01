import java.util.*;
public class ElectronicShop
{
    int sum=0,cnt=0;
    int maxVal=0;
    void priceCal(int[] keyP,int[] usbP,int money)
    {
        for (int i=0;i<keyP.length;i++)
        {
            for (int j=0;j<usbP.length;j++)
            {
              sum=keyP[i]+usbP[j];
              if (sum>money)
                  cnt=cnt+1;
              else if (maxVal<=money)
                  maxVal=Math.max(maxVal,sum);
            }
        }
        if (cnt==(keyP.length*usbP.length))
        {
            System.out.println("-1");
        }
        else
            {
                System.out.println(maxVal);
            }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int money=sc.nextInt();
        int keyB=sc.nextInt();
        int usb=sc.nextInt();
        int keyP[]=new int[keyB];
        int usbP[]=new int[usb];
        for(int i=0;i<keyB;i++)
        {
            keyP[i]=sc.nextInt();
        }
        for (int i=0;i<usb;i++)
        {
            usbP[i]=sc.nextInt();
        }
        ElectronicShop electronicShop=new ElectronicShop();
        electronicShop.priceCal(keyP,usbP,money);

    }
}
