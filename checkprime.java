import java.util.Scanner;;
public class checkprime {
    public static void main(String[] args) {
        System.out.println("Enter the no. : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i<n;i++){
            if (n%i!=0){
                System.out.println(" Prime");
            }
            else {
                System.out.println("Not Prime");
            }
        }
    }
}
