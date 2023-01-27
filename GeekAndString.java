public class GeekAndString {
    Stack<Character> stack = new Stack<>();
    for(int i=0;i<s.length();i++) {
        char c = s.charAt(i);
        if(stack.size()>0 && stack.peek()==c) {
            stack.pop();
        } else {
            stack.push(c);
        }
    }
    if(stack.size()==0) return "-1";
    StringBuilder sb = new StringBuilder();
    while(stack.size()>0) sb.append(Character.toString(stack.pop()));
    return sb.reverse().toString();
}
}///Pseudocode