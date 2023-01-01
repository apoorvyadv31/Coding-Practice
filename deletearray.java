import java.io.InputStream;
import java.text.BreakIterator;
import java.util.Scanner;
public class deletearray {
static int  delete (int n , int[]arr,int x){
    int i =0;
    for ( i =0;i<n;i++){
        if(arr[i]==x) {
            break;
        }}
if (arr[i]==n){
    return n;
}
for(int j =i;j<n-1;j++){
    arr[j]=arr[j+1];
   
}
return n-1;

    }



    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
    System.out.println("Enter total no of elements");
    int n = sc .nextInt();
    int []arr =new int[n];
    System.out.println("enter the array");
    for (int i =0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("enter element to be deleted");
    int x =sc.nextInt();
    n = delete(n, arr, x);
    for (int i =0;i<n;i++){
        System.out.print(arr[i]);
    }
}
}
