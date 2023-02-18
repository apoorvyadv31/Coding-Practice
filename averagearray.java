import java .util.Scanner;
public class averagearray {
public static void main(String[] args) {
    System.out.println("Enter no of arrays");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int []arr = new int [n];
    for ( int i = 0; i<n;i++){
        arr [i]= sc.nextInt();
    }
int sum = 0;
for ( int i = 0; i<n;i++)
{
    sum+=arr[i];
}
int avg = 0;
avg = sum/n;
System.out.println(avg);}}
