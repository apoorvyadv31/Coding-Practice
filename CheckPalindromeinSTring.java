import java.util.*;
public class CheckPalindromeinSTring {
    public static void main(String[] args) {
        System.out.println("Enter the String : ");
        Scanner sc = new Scanner (System.in);
             String a = sc.nextLine();
   
    int start=0; int end = a.length()-1;
       boolean isPalindrome=true;

       while (start<end){
        if (a.charAt(start)!=a.charAt(end)){
            isPalindrome=false;
            break;}
            start++; end--;

        }
        if (isPalindrome==true){
            System.out.println("Yes");
        }
        else {
            System.out.println("NO");
        }
       }
}
