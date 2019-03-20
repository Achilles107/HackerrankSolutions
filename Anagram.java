import java.util.*;
public class Anagram
{
  static void deletion(String str1,String str2)
  {
    HashMap<Character,Integer> hash1=new HashMap<>();
    HashMap<Character,Integer> hash2=new HashMap<>();
    HashSet<Character> hashComb=new HashSet<>();
    for(int i=0;i<str1.length();i++)
    {
        if(hash1.containsKey(str1.charAt(i)))
        {
          int count=(int) hash1.get(str1.charAt(i));
          hash1.put(str1.charAt(i),count+1);
        }
        else
        {
          hash1.put(str1.charAt(i),1);
        }
    }
    for(int i=0;i<str2.length();i++)
    {
        if(hash2.containsKey(str2.charAt(i)))
        {
          int count=(int) hash2.get(str2.charAt(i));
          hash2.put(str2.charAt(i),count+1);
        }
        else
        {
          hash2.put(str2.charAt(i),1);
        }
    }
    String comb=str1+str2;
    for(int i=0;i<comb.length();i++)
    {
      hashComb.add(comb.charAt(i));
    }
    int count=0;
    Iterator<Character> i=hashComb.iterator();
    while(i.hasNext())
    {
      Character c=i.next();
      if(hash1.containsKey(c) && hash2.containsKey(c))
      {
        int c1=(int) hash1.get(c);
        int c2=(int) hash2.get(c);
        int val=Math.abs(c1-c2);
        count=count+val;
      }
      else
      {
        if(hash1.containsKey(c))
        {
          count=count+(int) hash1.get(c);
        }
        else
        {
          count=count+(int) hash2.get(c);
        }
      }
    }
    //System.out.println(hash1);
    //System.out.println(hash2);
    //System.out.println(hashComb);
    System.out.println(count);
  }
  public static void main(String arsg[])
  {
    Scanner sc=new Scanner(System.in);
    String str1=sc.nextLine();
    String str2=sc.nextLine();
    deletion(str1,str2);
  }
}
