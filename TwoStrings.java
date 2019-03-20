import java.util.*;
public class TwoStrings
{
  static void common(String str1,String str2)
  {
    String com=str1+str2;
    HashSet<Character> set=new HashSet<>();
    for(int i=0;i<com.length();i++)
    {
      set.add(com.charAt(i));
    }
    int len=set.size();
    //System.out.println(len);
    Iterator<Character> i=set.iterator();
    while(i.hasNext())
    {
      Character c=i.next();
      if(str1.contains(""+c) && str2.contains(""+c))
      {
        System.out.println("YES");
        return;
      }
    }
    System.out.println("NO");
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int testCases=sc.nextInt();
    sc.nextLine();
    while(testCases>0){
    String str1=sc.nextLine();
    String str2=sc.nextLine();
    common(str1,str2);
    testCases--;
  }
  }
}
