import java.util.Scanner;
public class distinctelements {
public static int countdigits (int[]a,int n){
    int count = 0 ; boolean isDistinct= true;
    for (int i = 0 ; i<n;i++){
        for (int j = (i-1);j>=0;j--){
            if (a[i]==a[j]){
                isDistinct = false;
                break;
            }
        }
        if (isDistinct==true){
            count ++;}
           
        }
        return count;

}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int []a = new int [n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    System.out.println(countdigits(a, n));
}
}
