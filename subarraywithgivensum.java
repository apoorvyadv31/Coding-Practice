import java.util.*;
public class subarraywithgivensum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =sc.nextInt();
        int n = sc.nextInt();
        int[]arr= new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sum(arr, n, sum));

    }
    static boolean sum (int []arr, int n,int sum){
        int presum=0;
        HashSet<Integer>set= new HashSet<>();
        for(int i=0;i<n;i++){
            presum += arr[i];
        
        if (presum==sum)
        return true ;
        if (set.contains(presum-sum))
        return true ;
        set.add(presum);}
        return false ;
    }
}
