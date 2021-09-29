// // An expression will have unbalanced brackets if the 
// order of the brackets does not match, or if the opening
// brackets are more as compared to the closing brackets or
// the closing brackets are more as compared to the opening brackets.
//  So, if an expression has balanced brackets we have
//  to print true else we have to print false
import java.util.Scanner;
import java.util.Stack;

public class Balancedbrackets {
    public static boolean handleclosing(Stack <Character> st,char bracket) {
        if(st.size() == 0){
            return false;
        }
        else if(st.peek() != bracket){
            return false;
        }
        else{
            st.pop();
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else if(ch == ')'){
                Boolean val = handleclosing(st, '(');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            
            }
            else if(ch == '}'){
                Boolean val = handleclosing(st, '}');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }
            else if(ch == ']'){
                Boolean val = handleclosing(st, ']');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }
        }
        if(st.size() == 0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        scn.close();

    }
}
