import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class GameOfThronesOne
{
    static void canPallindrome(String str)
    {
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            int count=0;
            if(hashMap.containsKey(str.charAt(i)))
            {
                count=hashMap.get(str.charAt(i))+1;
                hashMap.put(str.charAt(i),count);

            }
            else{
                count=count+1;
                hashMap.put(str.charAt(i),count);
            }
        }
        Set<Character> set= hashMap.keySet();
        if(str.length()%2==0) {
            boolean even=true;
            for (int i = 0; i < hashMap.size(); i++) {

                if(hashMap.get(set.toArray()[i])%2==0)
                {
                    even=true;
                }
                else
                    {
                        even=false;
                        break;
                    }
            }
            if(even==true)
            {
                System.out.println("YES");
            }
            else
                {
                    System.out.println("NO");
                }
        }
        else
            {
                int even=0;
                int odd=0;
                for (int i = 0; i < hashMap.size(); i++) {

                    if(hashMap.get(set.toArray()[i])%2==0)
                    {
                        even=even+1;
                    }
                    else
                    {
                        odd=odd+1;
                    }
                }
                if(even==hashMap.size()-1 && odd==1)
                {
                    System.out.println("YES");
                }
                else
                    {
                        System.out.println("NO");
                    }
            }
        //System.out.println(hashMap);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        canPallindrome(str);
    }
}
