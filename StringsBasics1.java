import javax.sound.sampled.SourceDataLine;

public class StringsBasics1 {
    public static void main(String[] args) {
    
    String str ="aaaaa";
    String pattern ="aaa";
    int pos = str.indexOf(pattern);
    while (pos>=0){
        System.out.println(pos+"");
        pos=str.indexOf(pattern,pos+1);
    }

}}

