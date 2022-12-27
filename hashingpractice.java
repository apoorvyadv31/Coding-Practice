import java.util.*;
public class hashingpractice{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int []arr1 = new int [n];
   for (int i=0;i<n;i++){
    arr1[i]=sc.nextInt();
   }
   int m = sc.nextInt();

   int []arr2 = new int [m];
  for (int j=0;j<m;j++){
   arr2[j]=sc.nextInt();}

System.out.println(union(arr1, m, n, m));
}
static int union (int []arr1 ,int arr2 ,int n,int m ){
    HashSet <Integer>set=new HashSet<>();
    for(int i=0;i<n;i++)
    set.add(arr1[i]);
    
    return set.size();
}
}