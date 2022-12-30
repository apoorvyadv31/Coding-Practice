import java.util.*;
public class arlist {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(25);
        System.out.println(list);
        int element = list.get(1);
        System.out.println(element);
        list.set(1, 16);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.add(15);
        list.add(45);
        list.add(6);
        System.out.println(list);
        list.add(3,50);
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
       
    }

}
