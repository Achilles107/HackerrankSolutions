import java.util.*;
public class MagicSquare
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int[][] elem=new int[3][3];
        int rowSum=0,daiSum=0;
        int d=0;
        int magCons=(3*((3*3)+1))/2;
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                elem[i][j]=sc.nextInt();
                rowSum=rowSum+elem[i][j];
            }
            if (rowSum!=magCons)
            {
                d=d+Math.abs(magCons-rowSum);
            }
            rowSum=0;
        }

        System.out.println(d);
        //MagicSquare magicSquare=new MagicSquare();
    }
}
