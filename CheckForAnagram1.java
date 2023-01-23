import java.util.*;
public class CheckForAnagram1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter First String");
      String s1 = sc.nextLine();
      System.out.println("Enter Second String");
      String s2 = sc.nextLine();
      System.out.println(isAnagram(s1, s2));
}
static boolean isAnagram(String s1 ,String s2){
    if (s1.length()!=s2.length())
    return false ;
    char a1[]=s1.toCharArray();
    Arrays.sort(a1);
    s1 =new String(a1);
    char a2[]=s2.toCharArray();
    Arrays.sort(a2);
    s2=new String(a2);
    return s1.equals(s2);
}
}
