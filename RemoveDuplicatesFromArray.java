import java.util.Scanner;
public class RemoveDuplicatesFromArray {
    public static int removedups(int[]arr, int n){
        int res = 1;
        for (int i =1;i<n;i++){
            if(arr[res-1]!=arr[i]){
                res++;
            }
            
        }
        return res ;
    }
    public static void main(String[] args) {
       System.out.println("Enter the total elements");
       Scanner sc= new Scanner(System.in);
       int n =sc.nextInt();
       int []arr=new int[n];
       for (int i=0;i<n;i++){
        arr[i]= sc.nextInt();  }     
         n = removedups(arr, n);
        System.out.println("After :");
        for (int i=0;i<n;i++){
        System.out.print(arr[i]);
    }
}}
