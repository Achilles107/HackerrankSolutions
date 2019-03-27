import java.math.BigInteger;

public class Factorial
{
    static BigInteger fact(int n)
    {
        BigInteger f=new BigInteger("1");
        for(int i=2;i<=n;i++)
        {
            f=f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
    public static void main(String args[])
    {
        int n=30;
        System.out.println(fact(n));
    }
}
