
    import java.security.Key;
import java.util.*;
    public class majorityelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
        int[]arr= new int[n];
        for (int j=0;j<n;j++){
            arr[j]=sc.nextInt();
            HashMap<Integer,Integer>map=new HashMap<>();
            for(int i =0;i<n;i++){
                if(map.containsKey(arr[i])){
                    map.put(arr[i],map.get(arr[i]+1));}
                    else{
                        map.put(arr[i], 1);

                    }
                    for(int Key:map.keySet()){
                        if (map.get(Key)>n/3){
                            System.out.println(Key);
                        }
                    }

                
            }
        }
    }}
   
