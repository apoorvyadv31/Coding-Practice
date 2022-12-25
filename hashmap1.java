import java.util.*;
public class hashmap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr= new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }
    public static void frequency(int []arr, int n){
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]+1));
            }
            else {
                map.put(arr[i],1);
            }
        }
        for (int key : map.keySet()){
         System.out.println(key.getkey());
        }

    }
}
