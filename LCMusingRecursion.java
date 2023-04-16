import java.util.*;
public class LCMusingRecursion {
    static int GCD(int num1, int num2){
        if (num2==0)
        return num1;
        return GCD(num2, num1 %num2);
    }
    static int LCM(int num1, int num2){
        int ans= (num1*num2)/GCD(num1, num2);
        return ans ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        System.out.println("LCM OF THE NUMBERS IS:"+LCM(num1, num2));
    }
}
