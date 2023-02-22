import java.util.*;
class Equilbriumpoint{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total no. of values: ");
        int n = sc.nextInt();
       int [] arr=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
 
    }
    boolean epoint(int []arr , int n ){
        int ls=0; int rs=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++)
              ls+=arr[j];
            for(int k=i+1;k<n;k++)
            rs+=arr[k];
            if(ls==rs)
            return true ;
        }
        return false ;
    }
}