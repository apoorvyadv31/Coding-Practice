import java.util.Scanner;

public class intersection {
   public static void main(String[] args) {
   
    Scanner sc= new Scanner(System.in);
int n =sc.nextInt();
int a[]=new int[n];
for (int i=0;i<n;i++){
    a[i]=sc.nextInt();
}
int m =sc.nextInt();
int b[]=new int[m];
for (int i=0;i<m;i++){
    b[i]=sc.nextInt();
   } 
   
   sort(a, b, n, m);
 intersection ans = new intersection();

   

}
static void sort (int a[],int b[],int n ,int m ){
    int i=0; int j =0;
while (i<n && j<m){
    if (a[i]==a[i-1]){
        i++ ;
        continue ;
    }
    if (a[i]<b[j]){
        i++;
    }
    else if (a[i]>b[j]){
        j++;    }
        else {
            System.out.print(a[i]);
            i++ ;j++;
        }
}
}}
