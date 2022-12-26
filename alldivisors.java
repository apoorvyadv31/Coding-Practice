import java.util.Scanner;
public class alldivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
System.out.println("enter the second number");
int x = sc.nextInt();
        int count =1;
        
        for (int i =x; i<=n;i++){
            if (n%i==0){
                System.out.println(i);
                count = count +1;
        }

    }
    System.out.println("total divisors :" + count);
}
}