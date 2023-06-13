import java.util.*;
public class numberasSumofPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isprime(n));
    }
    static boolean primecheck(int n ){
        if (n<=1)
        return false ;
        for (int i=2;i*i<n;i++){
            if(n%i==0)
            return false;
        }
        return true ;
    }
    static boolean isprime(int n){
        if (primecheck(n)==true && primecheck(n-2)==true){
        return true ;}
        return false ;
    }
}
