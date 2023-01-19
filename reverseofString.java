public class reverseofString {
    public static void main(String[] args) {
        
    
    String a = "Apoorv";
    String b =" ";
    int ptr = a.length()-1;
    while (ptr>=0){
        b= b+ a.charAt(ptr);
        ptr--;
    }
    System.out.println(b);
}}
